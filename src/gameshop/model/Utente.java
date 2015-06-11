package gameshop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	

	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String cognome;
	
	@Column(nullable=false)
	private Date dataDiNascita;
	
	@Column(nullable=false)
	private Date dataDiRegistrazione;
	
	@Column(nullable=false)
	private String indirizzo;
	
	@Column(nullable=false)
	private String email;

	
	
	public Utente(String nome, String cognome, Date dataDiNascita,Date dataDiRegistrazione, String indirizzo, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.dataDiRegistrazione = dataDiRegistrazione;
		this.indirizzo = indirizzo;
		this.email = email;
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

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Date getDataDiRegistrazione() {
		return dataDiRegistrazione;
	}

	public void setDataDiRegistrazione(Date dataDiRegistrazione) {
		this.dataDiRegistrazione = dataDiRegistrazione;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
