package bo;

import java.time.LocalDate;

public class Heros {
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	
	public Heros(String nom, String prenom, LocalDate dateNaissance) {
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
	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	@Override
	public String toString() {
		return "Heros : " + nom + " " + prenom + ", né le " + dateNaissance ;
	}
	
	
}
