import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quelle opération souhaitez-vous réaliser :");
		System.out.println("1. Addition");
		System.out.println("2. Soustraction");
		
		int choix = scan.nextInt();
		System.out.println("Indiquez deux nombres pour réaliser l'opération.");
		int nombre1 = scan.nextInt();
		int nombre2 = scan.nextInt();
		
		scan.close();

		switch(choix) {
		case 1 : 
			System.out.println("Le total des deux nombres : " + (nombre1 + nombre2));
			break;
		case 2 :
			System.out.println("La soustraction des nombres : " + (nombre1 - nombre2));
			break;
		default :
			System.out.println("La valeur " + choix + " n'est pas une valeur valide.");
			break;		
		}

	}

}
