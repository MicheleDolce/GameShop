package gameshop.facade;

import gameshop.model.Prodotto;
import gameshop.model.RigaOrdine;





import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrderLineFacade {
	@PersistenceContext(unitName = "unit-GameShop")
	private EntityManager em;

	public RigaOrdine createRigaOrdine(Float prezzoUnitario, Integer quantita,Prodotto prodotto) {
		RigaOrdine rigaOrdine = new RigaOrdine(prezzoUnitario, quantita,prodotto);
		return rigaOrdine;
	}

	public RigaOrdine getRigaOrdine(Long id) {
		RigaOrdine rigaOrdine = em.find(RigaOrdine.class, id);
		return rigaOrdine;
	}
}
