package gameshop.controller;

import gameshop.facade.ProductFacade;
import gameshop.facade.UserFacade;
import gameshop.model.Prodotto;
import gameshop.model.Utente;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
public class UserController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String cognome;
	private Float giornoDiNascita;
	private Float meseDiNascita;
	private Float annoDiNascita;
	private String email;
	private String indirizzo;
	private Utente cliente;
	private List<Utente> listaUtenti;
	
	
	
	@EJB
	private UserFacade userFacade;
	
	
	public String registraUtente() {
		this.cliente = userFacade.registraUtente(nome, cognome, giornoDiNascita, meseDiNascita, annoDiNascita, email, indirizzo);
		return "cliente"; 
	}
	
	public String autenticaUtente(){
		this.cliente=null;
		String paginaSuccessiva;
		this.cliente= userFacade.autenticaUtente(email);
		if(this.cliente!=null){
			paginaSuccessiva="areaUtente";
		}else{
			 FacesMessage msg = new FacesMessage("Errore email errata!", "L'email è incorretta");
			 msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			 FacesContext.getCurrentInstance().addMessage(null, msg);
			 paginaSuccessiva="loginCliente";
		}
		
		return paginaSuccessiva;
	}
	
	public String mostraElencoUtenti(){
		this.listaUtenti=userFacade.mostraElencoUtenti();
		return "listaUtenti";
	}
	
	public String trovaUtente(Long id){
		this.cliente = userFacade.getUtente(id);
		return "cliente";
	}
	public String trovaUtente(){
		this.cliente = userFacade.getUtente(id);
		return "cliente";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Float getGiornoDiNascita() {
		return giornoDiNascita;
	}
	public void setGiornoDiNascita(Float giornoDiNascita) {
		this.giornoDiNascita = giornoDiNascita;
	}
	public Float getMeseDiNascita() {
		return meseDiNascita;
	}
	public void setMeseDiNascita(Float meseDiNascita) {
		this.meseDiNascita = meseDiNascita;
	}
	public Float getAnnoDiNascita() {
		return annoDiNascita;
	}
	public void setAnnoDiNascita(Float annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Utente getCliente() {
		return cliente;
	}
	public void setCliente(Utente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
