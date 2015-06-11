package gameshop.facade;

import gameshop.model.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class ProductFacade {
	
    @PersistenceContext(unitName = "unit-GameShop")
    private EntityManager em;
    
	/*public Product creaProdotto(String nome, String codice, String descrizione, Float prezzo,Float quantitaMagazino) {
		Product prodotto = new Product(nome, codice, descrizione, prezzo, quantitaMagazino);
		em.persist(prodotto);
		return prodotto;
	}*/
    
	public Product createProduct(String name, String code, Float price, String description) {
		Product product = new Product(name, description, price, code);
		em.persist(product);
		return product;
	}
	
	public Product getProduct(Long id) {
	    Product prodotto = em.find(Product.class, id);
		return prodotto;
	}
	
	public List<Product> getAllProducts() {
        CriteriaQuery<Product> cq = em.getCriteriaBuilder().createQuery(Product.class);
        cq.select(cq.from(Product.class));
        List<Product> prodotti = em.createQuery(cq).getResultList();
		return prodotti;
	}

	public void updateProduct(Product prodotto) {
        em.merge(prodotto);
	}
	
    private void deleteProduct(Product prodotto) {
        em.remove(prodotto);
    }

	public void deleteProduct(Long id) {
        Product prodotto = em.find(Product.class, id);
        deleteProduct(prodotto);
	}
	
}
