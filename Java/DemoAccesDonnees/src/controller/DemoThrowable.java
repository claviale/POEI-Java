package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoThrowable {
	public static void main(String[] args) {
		// uselessFunction(); // StackOverFlowError
		
		// "toto".age; // Error
		
		/* Essaie d'ajouter à l'infini un prénom dans une liste => OutOfMemoryError 
		List<String> prenoms = new ArrayList<>();
		while (true) {
			prenoms.add("toto");
		}
		*/
		
		//divide(10, 0); // RuntimeException (AricthmeticException) / by zero
		
		// Utiliser l'erreur pour la fonction :
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir 2 entiers");
		// Je pourrais mettre un try/catch autour des scan.nextInt pour me prémunir des saisies invalides.
		int nb1 = scan.nextInt();
		int nb2 = scan.nextInt();
		boolean divisionFailed = false;
		
		do {
			try {
				System.out.println(divideBis(nb1, nb2));
				divisionFailed = false;
			} catch (Exception e) {
				divisionFailed = true;
				System.err.println(e.getMessage());
				System.out.println("Veuillez recommencer la saisie du diviseur");
				nb2 = scan.nextInt();
			}
		} while (divisionFailed);
		
		scan.close();
	}
	
	// provoque une StackOverflowError -> ERROR (vient du dev et code)
	private static void uselessFunction() {
		uselessFunction();
	}
	
	private static int divide(int a, int b) {
		return a / b;
	}
	
	//Ajouter une exception personnalisée
	private static int divideBis(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Impossible de diviser par O");
		}
		return a / b;
	}
}
