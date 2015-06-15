package gameshop.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class RigaOrdine {

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Prodotto prodotto;

    @Column(nullable = false)
	private Float prezzoUnitario;
    @Column(nullable = false)
	private Integer quantita;
	
    public RigaOrdine() {
	}
    public RigaOrdine(Float prezzoUnitario, Integer quantita, Prodotto prodotto) {
		this.prezzoUnitario = prezzoUnitario;
		this.quantita = quantita;
		this.prodotto = prodotto;

	}

    
    public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(Float prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
    
    
}
