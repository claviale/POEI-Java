package bo.association.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name = "personnesMTM")
public class Personne {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String prenom;
	
	@ManyToMany
	@JoinTable(
		name = "asso_personne_pays",
		joinColumns = {@JoinColumn(name = "id_personne")},
		inverseJoinColumns = {@JoinColumn(name = "id_pays")}
	)
	private List <Pays> paysVisites;
	
	public Personne() {}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Pays> getPaysVisites() {
		return paysVisites;
	}

	public void setPaysVisites(List<Pays> paysVisites) {
		this.paysVisites = paysVisites;
	}
	
	
	
}
