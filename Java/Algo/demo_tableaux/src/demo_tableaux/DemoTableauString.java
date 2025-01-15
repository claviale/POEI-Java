package demo_tableaux;

import java.util.Scanner;

public class DemoTableauString {

	public static void main(String[] args) {
		
		System.out.println("Combien de prénoms allez vous saisir?");
		Scanner scan = new Scanner(System.in);
		int tailleTableau = scan.nextInt();
		scan.nextLine();
		
		String[] noms = new String[tailleTableau];
		
		for (int i = 0; i < tailleTableau; i++) {
			System.out.print("Veuillez saisir le prénom n°" + i + " : ");
			noms[i] = scan.nextLine();
		}
		
		scan.close();
		
		for (String nom : noms) {
			System.out.println(nom);
		}
	}
}
