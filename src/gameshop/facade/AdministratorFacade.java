package gameshop.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AdministratorFacade {

	@PersistenceContext(unitName = "unit-GameShop")
	   private EntityManager em;
}
