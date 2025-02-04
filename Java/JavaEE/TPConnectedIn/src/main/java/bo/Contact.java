package bo;

import java.time.LocalDate;

public class Contact {
	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String numTelephone;
	private String urlReseau;
	private String nomPoste;
	private String specialite;
	
	public Contact(int id, String nom, String prenom, LocalDate dateNaissance, String numTelephone, String urlReseau,
			String nomPoste, String specialite) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTelephone = numTelephone;
		this.urlReseau = urlReseau;
		this.nomPoste = nomPoste;
		this.specialite = specialite;
	}
	
	public Contact(String nom, String prenom, LocalDate dateNaissance, String numTelephone, String urlReseau,
			String nomPoste, String specialite) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTelephone = numTelephone;
		this.urlReseau = urlReseau;
		this.nomPoste = nomPoste;
		this.specialite = specialite;
	}
	
	public Contact() {}
	
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

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public String getUrlReseau() {
		return urlReseau;
	}

	public void setUrlReseau(String urlReseau) {
		this.urlReseau = urlReseau;
	}

	public String getNomPoste() {
		return nomPoste;
	}

	public void setNomPoste(String nomPoste) {
		this.nomPoste = nomPoste;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	
	
	
}
