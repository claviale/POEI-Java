package m3LaCreationDeClasse.deZeroEnHeros;

public class Heros {
	private String nom;
	private int pointsDeVie;
	private int attaque;
	
	public Heros(String nom, int pointsDeVie, int attaque) {
		this.nom = nom;
		this.pointsDeVie = pointsDeVie;
		this.attaque = attaque;
	}
	
	public boolean estVivant() {
		return pointsDeVie > 0;
	}
	
	public void attaquer(Heros autreHeros) {
		int pvAutreHeros = autreHeros.pointsDeVie;
		pvAutreHeros = pvAutreHeros - attaque;
		autreHeros.setPointsDeVie(pvAutreHeros);
		System.out.println(nom + " attaque " + autreHeros.getNom());
		System.out.println(this.toString());
		System.out.println(autreHeros.toString());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}
	
	@Override
	public String toString() {
		return nom
				+ " (PV : "
				+ pointsDeVie
				+ " - Atk : "
				+ attaque
				+ ")";
	}
}
