package gameshop.controller;

import gameshop.facade.OrderFacade;
import gameshop.facade.UserFacade;
import gameshop.model.Ordine;















import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@RequestScoped
@ManagedBean
public class OrdineController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private Date dataApertura;
	private Date dataChiusura;
	private Date dataEvasione;
	private Ordine ordine;
	private List<Ordine> listaOrdini;
	
	@ManagedProperty(value = "#{userController}")
	private UserController userController;
	
	@EJB
	private OrderFacade ordineFacade;

	
	public String confermaOrdine() {

		ordineFacade.confermaOrdine(this.userController.getOrdineTemp());
		this.ordine = null;
		this.userController.setOrdineTemp(null);
		return "ordineConcluso";
	}
	public String ordiniNonEvasi() {
		listaOrdini = ordineFacade.getAllOrdiniNonEvasi();
		return "ordiniNonEvasi";
	}
	public String creaOrdine() {
		this.ordine = ordineFacade.creaOrdine(this.userController.getCliente());
		this.userController.setOrdineTemp(this.ordine);
		return "nuovoOrdine";
	}
	public String tornaAlMenuCliente() {
		this.listaOrdini = null;
		return "clienteMenu";
	}
	public String ordiniCliente() {
		listaOrdini = ordineFacade.getAllOrdiniCliente(this.userController.getCliente());
		return "ordiniCliente";
	}
	public String tornaAlMenuDaDettagliOrdine() {
		this.ordine = null;
		return "ordiniCliente";
	}
	
	public String dettagliOrdine() {
		String idOrdine = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
		Long id = Long.valueOf(idOrdine);
		this.ordine = ordineFacade.getOrdine(id);
		return "dettagliOrdine";
	}
	
	public String trovaOrdine(){
		this.ordine = ordineFacade.getOrdine(id);
		return "ordine";
	}
	public String trovaOrdineAmministrazione(){
		this.ordine = ordineFacade.getOrdine(id);
		return "ordineAmministrazione";
	}
	public String tornaAlMenuAmministratore() {
		this.ordine = null;
		return "amministrazione";
	}
	
	public String evadiOrdine() {
		String idOrdine = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap().get("id");
		Long id = Long.valueOf(idOrdine);
		ordine = ordineFacade.getOrdine(id);
		String nextPage = ordineFacade.evadiOrdine(ordine);
		this.ordine = null;
		this.listaOrdini=null; 
		return nextPage;
	}
	
	public String mostraElencoOrdini(){
		this.listaOrdini = ordineFacade.getAllOrdini();
		return "listaOrdini";
	}
	
	
	public String mostraCliente(){
		this.ordine = ordineFacade.getOrdine(id);
		return "mostraClienti";
	}
	
	/*Metodi set e get */
	
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDataApertura() {
		return dataApertura;
	}


	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}


	public Date getDataChiusura() {
		return dataChiusura;
	}


	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}


	public Date getDataEvasione() {
		return dataEvasione;
	}


	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}


	public Ordine getOrdine() {
		return ordine;
	}


	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}


	public List<Ordine> getListaOrdini() {
		return listaOrdini;
	}


	public void setListaOrdini(List<Ordine> listaOrdini) {
		this.listaOrdini = listaOrdini;
	}






	



	public OrderFacade getOrdineFacade() {
		return ordineFacade;
	}


	public void setOrdineFacade(OrderFacade ordineFacade) {
		this.ordineFacade = ordineFacade;
	}


	public UserController getUserController() {
		return userController;
	}


	public void setUserController(UserController userController) {
		this.userController = userController;
	}



	
	
	
	
	
}
