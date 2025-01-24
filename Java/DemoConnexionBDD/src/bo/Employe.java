package bo;

import java.time.LocalDate;

public class Employe {
	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private LocalDate dateEmbauche;
	private float salaire;
	
	//Tous les attributs
	public Employe(int id, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, float salaire) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
	}
	
	//Tout sauf id
	public Employe(String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, float salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
	}
	
	//Aucun attribut
	public Employe() {}

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

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return  String.format("%-2d | %-20s | %-20s | %-12s | %-12s | %4.2f€\n",
				id,
				nom,
				prenom,
				dateNaissance,
				dateEmbauche,
				salaire);
	}
}
