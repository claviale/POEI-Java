import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {

		/*
		 * Ecrivez un programme qui demande un nombre à un utilisateur. Le programme
		 * recherche ce nombre dans un tableau d’entiers (par exemple, [1, 5, 7, 4, 9]).
		 * Si le nombre est trouvé, l’algorithme affiche la position de ce nombre. Dans
		 * le cas contraire, l’algorithme signale que le nombre recherché n’existe pas.
		 */
		
		int[] mesEntiers = new int[] { 1, 3, 4, 8, 9 };

		Scanner scan = new Scanner(System.in);
		System.out.println("Saisissez un nombre.");
	
		int nombreSaisi = scan.nextInt();
		scan.close();
		
		int positionNombre = -1;
		//boolean trouve = false;
		for (int i = 0; i < mesEntiers.length; i++) {

			if (nombreSaisi == mesEntiers[i]) {
				//trouve = true;
				positionNombre = i;
				System.out.println("Nombre trouvé à la position " + i);
			} 
		}
		
		//if (!trouve) { // if non trouvé (== false)
		if (positionNombre == -1) {
			System.out.println("Le nombre recherché n'existe pas.");
		}
	}
}
