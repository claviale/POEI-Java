
public class Exercice6 {

	public static void main(String[] args) {
		/*
		 * Ecrivez un programme qui double toutes les valeurs contenues dans un tableau.
		 * Par exemple, le tableau suivant : 1 | 3 | 8 | 2 | 5
		 * doit être transformé ainsi : 2 | 6 | 16 | 4 | 10
		 */
		
		int [] mesEntiers = {1, 3, 8, 2, 5};
		
		for (int i = 0; i < mesEntiers.length; i++) {
			mesEntiers[i] = mesEntiers[i] * 2;
		}
	
	}

}
