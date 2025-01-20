package m3LaCreationDeClasse.apprendreACompter;

public class CreerDesClasses {
	public static void main(String[] args) {
		exercice1();
	}

	private static void exercice1() {
		/*
		 * Complétez la classe Compteur
		 * Puis : 
		 *  - augmentez un compteur jusqu'à 5
		 *  - remettez-le à 0
		 *  - augmentez-le à nouveau de 3
		 *  - affichez sa valeur
		 */
		
		Compteur compteur = new Compteur();
		for(int i = 0; i < 5; i++) {
			compteur.plusUn();
		}
		System.out.println("Le compteur vaut : " + compteur.getValeur());
		
		compteur.reinitialiser();
		System.out.println("Le compteur vaut : " + compteur.getValeur());
		
		for(int i = 0; i < 3; i++) {
			compteur.plusUn();
		}
		System.out.println("Le compteur vaut : " + compteur.getValeur());
	}
}
