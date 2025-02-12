package bo.restaurant;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity @Table(name = "restaurants")
public class Restaurant {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Adresse adresse;
	
	@ManyToMany
	@JoinTable(
		name = "asso_fournisseurs_restaurants",
		joinColumns = {@JoinColumn(name = "restaurant_id")},
		inverseJoinColumns = {@JoinColumn(name = "fournisseur_id")}
	)
	private List <Fournisseur> fournisseurs;
	
	public Restaurant() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(List<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}
	
	
}
