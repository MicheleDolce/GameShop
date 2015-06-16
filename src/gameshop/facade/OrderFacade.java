package gameshop.facade;




import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import gameshop.model.Ordine;
import gameshop.model.Prodotto;
import gameshop.model.RigaOrdine;
import gameshop.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class OrderFacade {

	
	
	 @PersistenceContext(unitName = "unit-GameShop")
	 private EntityManager em;
	 
	 public void confermaOrdine(Ordine ordine) {
		 GregorianCalendar gc = new GregorianCalendar();
		 int anno = gc.get(Calendar.YEAR);
		 int mese = gc.get(Calendar.MONTH) + 1;
		 int giorno = gc.get(Calendar.DATE);
		 Date giornoChiusura = new Date(anno,mese,giorno);
			ordine.setDataChiusura(giornoChiusura);
			em.persist(ordine);
		}
	 public Ordine creaOrdine(Utente cliente) {
		 GregorianCalendar gc = new GregorianCalendar();
		 int anno = gc.get(Calendar.YEAR);
		 int mese = gc.get(Calendar.MONTH) + 1;
		 int giorno = gc.get(Calendar.DATE);
		 Date giornoApertura = new Date(anno,mese,giorno);
			Ordine ordine = new Ordine(giornoApertura,cliente);
			return ordine;
		}
	 public List<Ordine> getAllOrdiniCliente(Utente cliente) {
			List<Ordine> ordini; 
			TypedQuery<Ordine> q = em.createQuery("SELECT o FROM Ordine o WHERE o.utente.id = :id",Ordine.class);
			ordini = q.setParameter("id", cliente.getId()).getResultList();
			return ordini;
		}
	 
	 public Ordine getOrdine(Long id) {
			Ordine ordine = em.find(Ordine.class, id);
			return ordine;
		}
	 public List<Ordine> getAllOrdiniNonEvasi() {
			List<Ordine> ordini; 
			TypedQuery<Ordine> q = em.createQuery("SELECT o FROM Ordine o WHERE o.dataEvasione IS NULL",Ordine.class);
			ordini = q.getResultList();
			return ordini;
		}
	 public String evadiOrdine(Ordine ordine) {
			for(RigaOrdine ro: ordine.getRigheOrdine()) {
				Float quantitaInMagazzino = ro.getProdotto().getQuantitaMagazzino();
				Integer quantitaRichiesta = ro.getQuantita();
				if(quantitaInMagazzino>=quantitaRichiesta) {
					ro.getProdotto().rimuoviProdottoInMagazzino(quantitaRichiesta);
				} else {
					return "evasioneNonRiuscita";
				}
			}
			ordine.setDataEvasione(new Date());
			em.merge(ordine);
			return "evasioneRiuscita";
	 }
	 
	 
	 public List<Ordine> getAllOrdini(){
		 CriteriaQuery<Ordine> cq = em.getCriteriaBuilder().createQuery(Ordine.class);
			cq.select(cq.from(Ordine.class));
			List<Ordine> ordini = em.createQuery(cq).getResultList();
			return ordini;
		 
	 }
}

	 