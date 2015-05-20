package gameshop.facade;

import gameshop.model.Product;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class ProductFacade {
	
	  @PersistenceContext(unitName = "unit-GameShop")
	    private EntityManager em;
	  
	  
	  public List<Product> mostraElencoProdotti() {
	        CriteriaQuery<Product> cq = em.getCriteriaBuilder().createQuery(Product.class);
	        cq.select(cq.from(Product.class));
	        List<Product> prodotti = em.createQuery(cq).getResultList();
			return prodotti;
	  }
	
	
	public Product trovaProdotto(Long id){
		Product prodotto = em.find(Product.class, id);
		return prodotto;
	}
	
	
	
	
	
}
