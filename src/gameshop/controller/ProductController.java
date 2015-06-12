package gameshop.controller;

import java.util.List;

import gameshop.model.Prodotto;
import gameshop.facade.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;



@ManagedBean
public class ProductController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String codice;
	private String descrizione;
	private Float prezzo;
	private Float quantitaMagazzino;
	private Prodotto prodotto;
	private List<Prodotto> listaProdotti;
	
	@EJB
	private ProductFacade productFacade;
	
	public String creaProdotto() {
		this.prodotto = productFacade.creaProdotto(nome, codice, descrizione, prezzo,quantitaMagazzino);
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
	
	public String trovaProdotto(Long id){
		this.prodotto = productFacade.getProduct(id);
		return "prodotto";
	}
	
	public String trovaProdotto(String codice){
		this.prodotto = productFacade.getProduct(codice);
		return "prodotto";
	}
	
	public String trovaProdotto(){
		this.prodotto = productFacade.getProduct(id);
		return "prodotto";
	}
	
	public String modificaQuantita(){
		this.prodotto = productFacade.modificaQuantita(id, quantitaMagazzino);
		return "prodotto";
	}

	
	//Metodi get e set
	
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
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
	
	

}

