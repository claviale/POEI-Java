package m4LesAssociations.philateliste;

public class Timbre {
	private String nom;
	private int valeur;
	
	public Timbre(String nom, int valeur) {
		this.nom = nom;
		this.valeur = valeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Timbre [nom=" + nom + ", valeur=" + valeur + "]";
	}
	
}
