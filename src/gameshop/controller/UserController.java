package gameshop.controller;

import gameshop.facade.ProductFacade;
import gameshop.facade.UserFacade;
import gameshop.model.Cliente;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
public class UserController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String cognome;
	private int giornoDiNascita;
	private int meseDiNascita;
	private int annoDiNascita;
	private int giornoDiRegistrazione;
	private int meseDiRegistrazione;
	private int annoDiRegistrazione;
	private String email;
	private String indirizzo;
	private Cliente cliente;
	
	
	
	
	@EJB
	private UserFacade userFacade;
	
	
	public String registraUtente() {
		this.cliente = userFacade.registraUtente(nome, cognome, giornoDiNascita, meseDiNascita, annoDiNascita, email, indirizzo);
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
	public int getGiornoDiNascita() {
		return giornoDiNascita;
	}
	public void setGiornoDiNascita(int giornoDiNascita) {
		this.giornoDiNascita = giornoDiNascita;
	}
	public int getMeseDiNascita() {
		return meseDiNascita;
	}
	public void setMeseDiNascita(int meseDiNascita) {
		this.meseDiNascita = meseDiNascita;
	}
	public int getAnnoDiNascita() {
		return annoDiNascita;
	}
	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}
	public int getGiornoDiRegistrazione() {
		return giornoDiRegistrazione;
	}
	public void setGiornoDiRegistrazione(int giornoDiRegistrazione) {
		this.giornoDiRegistrazione = giornoDiRegistrazione;
	}
	public int getMeseDiRegistrazione() {
		return meseDiRegistrazione;
	}
	public void setMeseDiRegistrazione(int meseDiRegistrazione) {
		this.meseDiRegistrazione = meseDiRegistrazione;
	}
	public int getAnnoDiRegistrazione() {
		return annoDiRegistrazione;
	}
	public void setAnnoDiRegistrazione(int annoDiRegistrazione) {
		this.annoDiRegistrazione = annoDiRegistrazione;
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
