package gameshop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Fornitore {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private Long partitaIva;
	private String indirizzo;
	private Long numeroTelefono;
	private String email;
	@ManyToMany
	private List<Prodotto> prodotti;
	
	public Fornitore(Long partitaIva, String indirizzo, Long numeroTelefono,
			String email) {
		
		this.partitaIva = partitaIva;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(Long partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Long getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(Long numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	

}
