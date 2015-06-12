package gameshop.facade;

import gameshop.model.Prodotto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class ProductFacade {
	
    @PersistenceContext(unitName = "unit-GameShop")
    private EntityManager em;
    
	public Prodotto creaProdotto(String nome, String codice, String descrizione, Float prezzo,Float quantitaMagazzino) {
		Prodotto prodotto = new Prodotto(nome, codice, descrizione, prezzo, quantitaMagazzino);
		em.persist(prodotto);
		return prodotto;
	}
    
	public Prodotto createProduct(String name, String code, Float price, String description) {
		Prodotto product = new Prodotto(name, description, price, code);
		em.persist(product);
		return product;
	}
	
	public Prodotto getProduct(Long id) {
	    Prodotto prodotto = em.find(Prodotto.class, id);
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
