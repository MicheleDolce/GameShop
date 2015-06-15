package gameshop.controller;

import java.util.List;

import gameshop.model.Prodotto;
import gameshop.facade.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@RequestScoped
@ManagedBean
public class ProductController {
	
	@ManagedProperty(value="#{param.codice}")
	private Long codice;
	private String nome;
    private String descrizione;
	private Float prezzo;
	private Float quantitaMagazzino;
	private Prodotto prodotto;
	private List<Prodotto> listaProdotti;
	@ManagedProperty(value = "#{userController}")
	private UserController userController;
	
	@EJB
	private ProductFacade productFacade;
	
	public String creaProdotto() {
		this.prodotto = productFacade.creaProdotto(nome, descrizione, prezzo,quantitaMagazzino);
		return "prodotto"; 
	}
	
	public String mostraElencoProdotti() {
		this.listaProdotti = productFacade.getAllProducts();
		return "listaProdotti"; 
	}
	public String mostraElencoProdottiAmministratore() {
		this.listaProdotti = productFacade.getAllProducts();
		return "listaProdottiAmministrazione"; 
	}
	public String mostraElencoProdottiOrdine() {
		this.listaProdotti = productFacade.getAllProducts();
		return "listaProdottiOrdine"; 
	}
	
	public String trovaProdotto(Long codice){
		this.prodotto = productFacade.getProduct(codice);
		return "prodotto";
	}
	
	public String trovaProdottoAmministratore(){
		this.prodotto = productFacade.getProduct(codice);
		return "prodottoAmministrazione";
	}
	
	 public String trovaProdotto(){
		this.prodotto = productFacade.getProduct(codice);
		return "prodotto";
	}
	
	public String modificaQuantita(){
		this.prodotto = productFacade.modificaQuantita(codice, quantitaMagazzino);
		return "prodottoAmministrazione";
	}
	public String prodottoPerOrdine() {
		this.prodotto = productFacade.getProduct(codice);
		this.userController.setProdottoTemp(this.prodotto);
		return "inserisciQuantita";
	}


	
	//Metodi get e set
	
		
	public Long getCodice() {
		return codice;
	}
	public void setCodice(Long codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}
	public Float getQuantitaMagazzino() {
		return quantitaMagazzino;
	}
	public void setQuantitaMagazzino(Float quantitaMagazzino) {
		this.quantitaMagazzino = quantitaMagazzino;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	public List<Prodotto> getListaProdotti() {
		return listaProdotti;
	}
	public void setListaProdotti(List<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}

	public UserController getUserController() {
		return userController;
	}

	public void setUserController(UserController userController) {
		this.userController = userController;
	}

	public ProductFacade getProductFacade() {
		return productFacade;
	}

	public void setProductFacade(ProductFacade productFacade) {
		this.productFacade = productFacade;
	}
	
	

}

