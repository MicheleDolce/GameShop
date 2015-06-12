package gameshop.facade;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import gameshop.model.Prodotto;
import gameshop.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class UserFacade {

	
	 @PersistenceContext(unitName = "unit-GameShop")
	    private EntityManager em;
	 
	 public Utente registraUtente(String nome,String cognome, Float giornoDiNascita,Float meseDiNascita,Float annoDiNascita,String email,String indirizzo){
		 GregorianCalendar gc = new GregorianCalendar();
		 int anno = gc.get(Calendar.YEAR);
		 int mese = gc.get(Calendar.MONTH) + 1;
		 int giorno = gc.get(Calendar.DATE);
		 Date dataDiRegistrazione= new Date(anno,mese,giorno);
		 int giornoDiNascitaIntero = (int)giornoDiNascita.doubleValue();
		 int meseDiNascitaInt = (int)meseDiNascita.doubleValue();
		 int annoDiNascitaInt = (int)annoDiNascita.doubleValue();
		 Date dataDiNascita= new Date(annoDiNascitaInt,meseDiNascitaInt,giornoDiNascitaIntero);
		 Utente cliente= new Utente(nome,cognome,dataDiNascita,dataDiRegistrazione,indirizzo,email);
		 em.persist(cliente);
		 return cliente;
	 }
	 
	 public Utente autenticaUtente(String email){
		 Query query = em.createQuery("Select u FROM Utente e WHERE e.email = :email ");
		 Utente trovato =null;
		 try{
			  trovato = (Utente)query.getSingleResult();
		 }catch(Exception e){
			 
		 }
		 return trovato;
	 }
	 
	 public List<Utente> mostraElencoUtenti() {
	        CriteriaQuery<Utente> cq = em.getCriteriaBuilder().createQuery(Utente.class);
	        cq.select(cq.from(Utente.class));
	        List<Utente> listaUtenti = em.createQuery(cq).getResultList();
			return listaUtenti;
		}
	 public Utente getUtente(Long id) {
		    Utente utente = em.find(Utente.class, id);
			return utente;
		}
}
