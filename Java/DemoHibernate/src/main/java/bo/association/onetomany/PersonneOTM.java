package bo.association.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name = "personnesOTM")
public class PersonneOTM {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "nom")
	private String nom;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_personne")
	private List<AdresseMTO> adresses;

	public PersonneOTM() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<AdresseMTO> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<AdresseMTO> adresses) {
		this.adresses = adresses;
	}
	
	
	
}
