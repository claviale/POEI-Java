import java.util.Scanner;

public class Atelier2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Exercice 5
		//Proposez un code qui demande le nom et l’âge d’un utilisateur, puis les affiche à l’écran.
		System.out.println("Veuillez saisir votre nom");
		String nom = scan.nextLine();
		
		System.out.println("Veuillez saisir votre âge");
		int age = scan.nextInt();
		
		System.out.println(
				"Vous vous appelez "
						+ nom
						+ " et vous avez "
						+ age
						+ " ans.");
		
		//Exercice 6
		//Proposez un code qui demande à l’utilisateur de saisir un nombre, et renvoie sa valeur au carré 
		System.out.println("Veuillez saisir le nombre dont vous voulez connaître le carré : ");
		int nombre = scan.nextInt();
		int resultat = nombre * nombre;
		System.out.println("Votre nombre au carré : " + resultat);
		
		
		//Exercice 7
		//Proposez un code qui demande deux chiffres à un utilisateur, et restitue leur somme, leur produit, leur différence, leur quotient, leur modulo et leur moyenne
		System.out.println("Veuillez saisir deux nombres :");
		int nombre1 = scan.nextInt();
		int nombre2 = scan.nextInt();
		scan.close();
		
		System.out.println("Somme : " + (nombre1 + nombre2));
		System.out.println("Différence : " + (nombre1 - nombre2));
		System.out.println("Produit : " + (nombre1 * nombre2));
		System.out.println("Quotient : " + (nombre1 / nombre2));
		System.out.println("Reste : " + (nombre1 % nombre2));
		System.out.println("Moyenne : " + (nombre1 + nombre2) / 2f);
		
		
	}

}
