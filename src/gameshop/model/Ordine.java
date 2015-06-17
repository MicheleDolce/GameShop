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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ordine {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataApertura;
	
	@Temporal(TemporalType.DATE)
	private Date dataChiusura;
	
	@Temporal(TemporalType.DATE)
	private Date dataEvasione;
	
	
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	@JoinColumn(name = "ordini_id")
	private List<RigaOrdine> righeOrdine;
	
	

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Utente utente;
	
	public Ordine() {}
	
	public Ordine(Date dataCreazione, Utente cliente) {
		this.utente = cliente;
		this.dataApertura = dataCreazione;
		this.righeOrdine = new ArrayList<RigaOrdine>();

	}
	
	
	public List<RigaOrdine> getRigheOrdine() {
		return righeOrdine;
	}


	public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
		this.righeOrdine = righeOrdine;
	}


	public Utente getUtente() {
		return utente;
	}


	public void setUtente(Utente utente) {
		this.utente = utente;
	}


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
	
	
	
}
