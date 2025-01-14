package visibilite.jeu;

import java.util.Random;

// Nom de classe : majuscule
public class De {
	
	// 1. Attributs d'instances
	
	// Nom d'attribut / variable : minuscule
	private int nbFaces;
	private int resultat;
	
	// 2. Attributs de classe
	
	// 3. Constructeurs
	
	public De(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	// 4. Methodes d'instances
	
	public void lancer() {
		Random rand = new Random();
		resultat = rand.nextInt(1, nbFaces + 1);
	}
	
	// 5. Methodes de classe
	
	// 6. Getters et setters
	
	// Nom de méthode : minuscule
	public int getNbFaces() {
		return nbFaces;
	}
	
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	public int getResultat() {
		return resultat;
	}
}
