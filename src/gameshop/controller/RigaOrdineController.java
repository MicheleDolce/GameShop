package gameshop.controller;


import gameshop.facade.OrderLineFacade;
import gameshop.model.Ordine;
import gameshop.model.Prodotto;
import gameshop.model.RigaOrdine;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@RequestScoped
@ManagedBean
public class RigaOrdineController {
	private Long id;
	private Integer quantita;
	private Prodotto prodotto;
	
	@ManagedProperty(value = "#{userController}")
	private UserController userController;
	
	private RigaOrdine rigaOrdine;
	private Ordine ordine;

	@EJB
	private OrderLineFacade rigaOrdineFacade;
	
	/*public String metodoProva(){
		Long x=new Long(1);
		if(this.userController.getProdottoTemp().getNome().equals("Penna"))
			return "index";
		else return "areaUtente";
		
	}*/
	public String creaRigaOrdine() {
		this.prodotto=this.userController.getProdottoTemp();
		this.rigaOrdine = rigaOrdineFacade.createRigaOrdine(prodotto.getPrezzo(),quantita, prodotto);
		this.userController.setProdottoTemp(null);
		this.userController.getOrdineTemp().getRigheOrdine().add(this.rigaOrdine);
		return "nuovoOrdine";
	}

	public String findRigaOrdine() {
		this.setRigaOrdine(rigaOrdineFacade.getRigaOrdine(id));
		return "rigaOrdine";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public RigaOrdine getRigaOrdine() {
		return rigaOrdine;
	}

	public void setRigaOrdine(RigaOrdine rigaOrdine) {
		this.rigaOrdine = rigaOrdine;
	}

	public Ordine getOrdine() {
		return ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}

	/*public OrdineController getOrdineController() {
		return ordineController;
	}

	public void setOrdineController(OrdineController ordineController) {
		this.ordineController = ordineController;
	}*/

	public OrderLineFacade getRigaOrdineFacade() {
		return rigaOrdineFacade;
	}

	public void setRigaOrdineFacade(OrderLineFacade rigaOrdineFacade) {
		this.rigaOrdineFacade = rigaOrdineFacade;
	}
	public UserController getUserController() {
		return userController;
	}
	public void setUserController(UserController userController) {
		this.userController = userController;
	}

	
	
	
	
}
