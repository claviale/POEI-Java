package controller;

import java.util.Scanner;

public class DemoIO {
	public static void main(String[] args) {
		// Input clavier en java
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir votre prénom : ");
		String prenom = scan.nextLine();
		scan.close();
		
		// Output dans la console
		System.out.println("Vous vous appelez : " + prenom);
		
		// Output d'erreur dans la console
		System.err.println("Un message d'erreur");
	}
}
