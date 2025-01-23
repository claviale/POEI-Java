import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {

		/*
		 * Proposez un code qui demande à l’utilisateur de saisir un nombre, puis
		 * affiche tous les carrés inférieurs à cette valeur. Par exemple, si
		 * l’utilisateur saisit 12, on attendra les valeurs (1, 4, 9).
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre");
		int nombre = scan.nextInt();

		scan.close();

		int compteur = 1;
		while (compteur * compteur < nombre) {
			System.out.println(compteur * compteur);
			compteur++;

		}

		// for (iny i = 1; i * i < nombre; i++) {
		// System.out.println(i * i);
	}
}
