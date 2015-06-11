package gameshop.controller;

import java.util.List;

import gameshop.model.Product;
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
	//private Float quantitaMagazino;
	private Product prodotto;
	private List<Product> listaProdotti;
	
	@EJB
	private ProductFacade productFacade;
	
	public String createProduct() {
		this.prodotto = productFacade.createProduct(nome, codice, prezzo, descrizione);
		return "product"; 
	}
	
	public String mostraElencoProdotti() {
		this.listaProdotti = productFacade.getAllProducts();
		return "listaProdotti"; 
	}
	
	public String trovaProdotto(Long id){
		this.prodotto = productFacade.getProduct(id);
		return "prodotto";
	}
	
	public String trovaProdotto(){
		this.prodotto = productFacade.getProduct(id);
		return "prodotto";
	}
	
	/*public String creaProdotto(){
		this.prodotto = productFacade.creaProdotto(nome, codice, descrizione, prezzo, quantitaMagazino);
		return "product";
	}
	*/
	
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
/*	public Float getQuantitaMagazino() {
		return quantitaMagazino;
	}
	public void setQuantitaMagazino(Float quantitaMagazino) {
		this.quantitaMagazino = quantitaMagazino;
	}*/
	public Product getProdotto() {
		return prodotto;
	}
	public void setProdotto(Product prodotto) {
		this.prodotto = prodotto;
	}
	public List<Product> getListaProdotti() {
		return listaProdotti;
	}
	public void setListaProdotti(List<Product> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}
	
	

}

