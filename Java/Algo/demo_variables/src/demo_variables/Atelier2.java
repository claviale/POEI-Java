package demo_variables;

import java.util.Scanner;

public class Atelier2 {

	public static void main(String[] args) {
		
		//Proposez un code qui demande le nom et l’âge d’un utilisateur, puis les affiche à l’écran.
		System.out.println("Veuillez saisir votre nom et votre âge");
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		int age = scan.nextInt();
		System.out.println("Vote nom est " + nom + ". Vous avez " + age + " ans.");
		
		//Proposez un code qui demande à l’utilisateur de saisir un nombre, et renvoie sa valeur au carré 
		System.out.println("Veuillez saisir un nombre");
		int nombre = scan.nextInt();
		int resultat = nombre * nombre;
		System.out.println("Votre nombre au carré : " + resultat);
		
		//Proposez un code qui demande deux chiffres à un utilisateur, et restitue leur somme, leur produit, leur différence, leur quotient, leur modulo et leur moyenne  
		System.out.println("Veuillez saisir deux chiffres");
		int chiffre1 = scan.nextInt();
		int chiffre2 = scan.nextInt();
		scan.close();
		
		int somme = chiffre1 + chiffre2;
		int produit = chiffre1 * chiffre2;
		int difference = chiffre1 - chiffre2;
		int quotient = chiffre1 / chiffre2;
		int modulo = chiffre1 % chiffre2;
		int moyenne = chiffre1;
		
		System.out.println("La somme des deux chiffres : " + somme);
		System.out.println("Le produit des deux chiffres : " + produit);
		System.out.println("La différence des deux chiffres : " + difference);
		System.out.println("Le quotient des deux chiffres : " + quotient);
		System.out.println("Le modulo des deux chiffres : " + modulo);
		System.out.println("La moyenne des deux chiffres : " + moyenne);
	}

}
