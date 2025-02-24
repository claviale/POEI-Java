package bo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "post_its")
public class PostIt {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titre;
	private String contenu;
	
	@Column(name = "date_creation")
	private LocalDate dateCreation;
	
	@Column(name = "date_modification")
	private LocalDate dateModification;

	public PostIt(int id, String titre, String contenu, LocalDate dateCreation, LocalDate dateModification) {
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public PostIt(String titre, String contenu, LocalDate dateCreation, LocalDate dateModification) {
		this.titre = titre;
		this.contenu = contenu;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public PostIt() {}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	public LocalDate getDateModification() {
		return dateModification;
	}

	public void setDateModification(LocalDate dateModification) {
		this.dateModification = dateModification;
	}
	
	
}
