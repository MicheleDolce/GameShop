package gameshop.model;
import javax.persistence.*;
import javax.validation.GroupSequence;
@Entity
public class Prodotto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long codice;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(length=1000)
	private String descrizione;
	
	@Column(nullable=false)
	private Float prezzo;
	
	@Column(nullable=false)
	private Float quantitaMagazzino;
	
	public Prodotto(String nome, String descrizione, Float prezzo,Float quantitaMagazino){
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantitaMagazzino = quantitaMagazino;
		
	}

	
	// Metodi get e set
	
	
	
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
	
	
	
    // Metodi hasCode  e equals
	
	
/*	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result
				+ ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((prezzo == null) ? 0 : prezzo.hashCode());
		result = prime
				* result
				+ ((quantitaMagazino == null) ? 0 : quantitaMagazino.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prezzo == null) {
			if (other.prezzo != null)
				return false;
		} else if (!prezzo.equals(other.prezzo))
			return false;
		if (quantitaMagazino == null) {
			if (other.quantitaMagazino != null)
				return false;
		} else if (!quantitaMagazino.equals(other.quantitaMagazino))
			return false;
		return true;
	}


	
	// Metodo toString

	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", nome=" + nome + ", codice=" + codice
				+ ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", quantitaMagazino=" + quantitaMagazino + "]";
	}
*/
}
