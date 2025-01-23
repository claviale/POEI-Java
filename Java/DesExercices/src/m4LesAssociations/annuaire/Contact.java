package m4LesAssociations.annuaire;

public class Contact {
	private String nom;
	private String prenom;
	private Coordonnees coordonnees;
	
	public Contact(String nom, String prenom) {
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

	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + ", coordonnees=" + coordonnees + "]";
	}
	
	
	
}
