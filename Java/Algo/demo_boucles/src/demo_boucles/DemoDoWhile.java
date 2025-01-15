package demo_boucles;

import java.util.Scanner;

public class DemoDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre entre 1 et 5");
		int choix;
		do {
			choix = scan.nextInt();
			
			if (choix < 1 || choix > 5) {
				System.err.println("J'ai dis entre 1 et 5 pauvre nouille.");
			}
		} while (choix < 1 || choix > 5);
		
		scan.close();
		
		System.out.println("Congratulations, vous avez choisi la valeur " + choix);
	}

}
