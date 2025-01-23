package association_bidirectionnelle;

public class Eleve {
	private String prenom;
	private Groupe groupe;
	
	public Eleve(String prenom, Groupe groupe) {
		this.prenom = prenom;
		this.groupe = groupe;
	}
	
	// Pouvoir créer un élève sans groupe
	public Eleve(String prenom) {
		this.prenom = prenom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	@Override
	public String toString() {
		return "Eleve [prenom=" + prenom + ", groupe=" + groupe.getNom() + "]";
	}
	
}
