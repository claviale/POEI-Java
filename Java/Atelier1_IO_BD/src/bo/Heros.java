package bo;

import java.time.LocalDate;

public class Heros {
	private String nom;
	private String prenom;
	private String dateNaissance;
	
	public Heros(String nom, String prenom, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getDateNaissance() {
		return dateNaissance;
	}
}
