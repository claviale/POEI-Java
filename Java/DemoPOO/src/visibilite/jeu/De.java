package visibilite.jeu;

import java.util.Random;


// Nom de classe : majuscule
public class De {
	
	// 1. Attributs d'instances
	// Nom d'attribut / variable : minuscule
	private int nbFaces;
	private int resultat;
	
	// 2. Attributs de classe
	private static int nbDesInstancies = 0;
	
	// 3. Constructeurs
	public De() {
		this(6);
	}
	
	public De(int nbFaces) {
		//s'il y a des controles dans le setter, ils sont vérifiés lors de l'appel au constructeur
		setNbFaces(nbFaces);
		nbDesInstancies++; 
		lancer();
	}
	
	// 4. Methodes d'instances
	public void lancer() {
		Random rand = new Random();
		resultat = rand.nextInt(1, nbFaces + 1);
	}
	
	// 5. Methodes de classe
	private static void verifierNombreFaces(int nbFaces) {
		if (nbFaces < 2) {
			throw new RuntimeException("Il faut au moins 2 faces au dé");
		}
	}
	
	// 6. Getters et setters
	// Nom de méthode : minuscule
	public int getNbFaces() {
		return nbFaces;
	}
	
	public void setNbFaces(int nbFaces) {
		verifierNombreFaces(nbFaces);
		this.nbFaces = nbFaces;
	}
	
	public int getResultat() {
		return resultat;
	}
	
	public static int getNbDesInstancies() {
		return nbDesInstancies;
	}
}
