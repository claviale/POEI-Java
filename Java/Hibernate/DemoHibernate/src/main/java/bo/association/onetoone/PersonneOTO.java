package bo.association.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name = "personnesOTO")
public class PersonneOTO {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "nom")
	private String nom;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private AdresseOTO adresse;

	public PersonneOTO() {}

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

	public AdresseOTO getAdresse() {
		return adresse;
	}

	public void setAdresse(AdresseOTO adresse) {
		this.adresse = adresse;
	}
	
}
