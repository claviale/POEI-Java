package demo_variables;

public class OperationArithmetique {

	public static void main(String[] args) {
		//Déclaration de variables
		int nombre1;
		int nombre2;
		
		//Affectation des valeurs à mes variables
		nombre1 = 5;
		nombre2 = 1_234_567; //Utilisation des underscores pour la lisibilité du nombre
		
		//Déclaration + affectation
		float pi = 3.14f;
		char genre = 'F';
		String phrase = "Citation : \"Hello c'est moi\"";
		boolean majeur = true;
		
		System.out.println(nombre1 + nombre2);
		System.out.println(pi);
		System.out.println(genre);
		System.out.println(phrase);
		System.out.println(majeur);
		
		//Opérateurs arithmétiques
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		System.out.println(5 / 3);
		System.out.println(5 * 3);
		System.out.println(5 % 3); // Modulo = 5 / 3 quel est le reste = 2
		
		//Incrémentations et décrémentations
		System.out.println(nombre1); //5
		
		nombre1++; //nombre1 = nombre1 + 1;
		System.out.println(nombre1); //6
		
		nombre1+=3; //nombre1 = nombre1 + 3;
		System.out.println(nombre1); //9
		
		nombre1--;
		System.out.println(nombre1); //8
		
		nombre1-=2;
		System.out.println(nombre1); //6
		
		nombre1 /=3;
		System.out.println(nombre1); //2
		
		nombre1 *=8;
		System.out.println(nombre1); //16
		
		
		//Post incrémentation (après exécution donc incrémente après affichage, le résultat affiché n'est pas incrémenté)
		System.out.println(nombre1++); //16
		System.out.println(nombre1); //17 affiche l'incrémentation d'avant
		
		//Pré incrémentation (affiche le résultat déjà incrémenté)
		System.out.println(++nombre1); //18
		
		//Meilleur usage de l'incrémentation pré et post
		//Post incrémentation
		nombre1++;
		System.out.println(nombre1);
		//Pré incrémentation
		System.out.println(nombre1);
		nombre1++;
	}
	
}
