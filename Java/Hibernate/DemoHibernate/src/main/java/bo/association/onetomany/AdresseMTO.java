package bo.association.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "adressesMTO")
public class AdresseMTO {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name = "ville")
	private String ville;
	
	@Column(name = "code_postal")
	private String codePostal;
	
	//Utilisation du mappedBy dans le cas d'une asso bidirectionnelle
	//@OneToOne(mappedBy = "adresse")
	//private Personne proprietaire;
	// + getter et setter pour proprietaire
	
	public AdresseMTO() {}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
}
