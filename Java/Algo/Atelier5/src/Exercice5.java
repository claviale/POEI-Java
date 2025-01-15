
public class Exercice5 {

	public static void main(String[] args) {
		/*
		 * Ecrivez un programme inversant les valeurs d’un tableau. Par exemple, le
		 * tableau suivant : 1 | 3 | 8 | 2 | 5
		 * doit être transformé ainsi : 5 | 2 | 8 | 3 | 1
		 */
	
		int [] mesEntiers = {1, 3, 8, 2, 5};
		
		//VERSION NUMBER 1
		int [] mesEntiersRenverses = new int[mesEntiers.length];
		
		for(int i = 0; i < mesEntiers.length; i++) {
			mesEntiersRenverses[i] = mesEntiers[mesEntiers.length - 1 - i];
		}
		
		for (int entier : mesEntiersRenverses) {
			System.out.println(entier);
		}
		
		//VERSION NUMBER 2
		for (int i = 0; i < mesEntiers.length / 2; i++) {
			int tmp = mesEntiers[i];
			mesEntiers[i] = mesEntiers[mesEntiers.length - 1 - i];
			mesEntiers[mesEntiers.length - 1 - i] = tmp;
		}
		
		for (int entier : mesEntiers) {
			System.out.println(entier);
		}

	}

}
