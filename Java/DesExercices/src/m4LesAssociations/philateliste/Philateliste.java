package m4LesAssociations.philateliste;

import java.util.List;

public class Philateliste {
	private String nom;
	private String prenom;
	private List<Timbre> timbres;
	
	public Philateliste(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
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

	public List<Timbre> getTimbres() {
		return timbres;
	}

	public void setTimbres(List<Timbre> timbres) {
		this.timbres = timbres;
	}

	@Override
	public String toString() {
		return "Philateliste [nom=" + nom + ", prenom=" + prenom + ", timbres=" + timbres + "]";
	}
	
}
