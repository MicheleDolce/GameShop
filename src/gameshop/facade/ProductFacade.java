package gameshop.facade;

import gameshop.model.Prodotto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class ProductFacade {

	@PersistenceContext(unitName = "unit-GameShop")
	private EntityManager em;

	public Prodotto creaProdotto(String nome, String descrizione, Float prezzo,Float quantitaMagazzino) {
		Prodotto prodotto = null;


			prodotto = new Prodotto(nome, descrizione, prezzo, quantitaMagazzino);
			em.persist(prodotto);
		
		return prodotto;


	}

	public Prodotto modificaQuantita(Long codice, Float quantitaMagazzino){
		Prodotto prodotto = null;
		try {
			prodotto = getProduct(codice);
		}catch(Exception e) {}
		prodotto.setQuantitaMagazzino(quantitaMagazzino);
		return prodotto;
		
	}
	public Prodotto getProduct(Long codice) {
		Prodotto prodotto = em.find(Prodotto.class, codice);
		return prodotto;
	}

	public List<Prodotto> getAllProducts() {
		CriteriaQuery<Prodotto> cq = em.getCriteriaBuilder().createQuery(Prodotto.class);
		cq.select(cq.from(Prodotto.class));
		List<Prodotto> prodotti = em.createQuery(cq).getResultList();
		return prodotti;
	}

	public void updateProduct(Prodotto prodotto) {
		em.merge(prodotto);
		}

	private void deleteProduct(Prodotto prodotto) {
		em.remove(prodotto);
	}

	public void deleteProduct(Long id) {
		Prodotto prodotto = em.find(Prodotto.class, id);
		deleteProduct(prodotto);
	}

}
