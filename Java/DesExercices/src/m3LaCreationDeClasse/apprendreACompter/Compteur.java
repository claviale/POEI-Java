package m3LaCreationDeClasse.apprendreACompter;

/*
 * La classe Compteur consiste en un compteur répondant aux règles suivantes :
 *  - un compteur représente un nombre commençant à 0
 *  - il est possible d'augmenter ce nombre, uniquement de 1 en 1
 *  - il est possible de remettre le compteur à 0
 *  - il est impossible de diminuer le compteur (hors remise à 0)
 *  - il est possible de consulter la valeur du compteur a tout moment
 */
public class Compteur {
	private int valeur = 0;

	public int getValeur() {
		return valeur;
	}

	public void plusUn() {
		valeur++;
	}
	
	public void reinitialiser() {
		valeur = 0;
	}
}
