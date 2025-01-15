package demo_conditions;

import java.util.Scanner;

public class DemoSwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le jour de la semaine.");
		String jour = scan.nextLine().toLowerCase();
		
		scan.close();

		switch(jour) {
		case "lundi" : 
			System.out.println("C'est le 1er jour de la semaine.");
			break;
		case "mardi" :
			System.out.println("C'est le 2e jour de la semaine.");
			break;
		case "mercredi" :
			System.out.println("C'est le 3e jour de la semaine.");
			break;
		case "jeudi" :
			System.out.println("C'est le 4e jour de la semaine.");
			break;
		case "vendredi" :
			System.out.println("C'est le 5e jour de la semaine.");
			break;
		case "samedi" :
			System.out.println("C'est le 6e jour de la semaine.");
			break;
		case "dimanche" :
			System.out.println("C'est le dernier jour de la semaine.");
			break;
		default :
			System.out.println("La valeur " + jour + " n'est pas une valeur valide.");
			break;		
		}
		
		//Déterminer si c'est le weeek end ou pas
		switch(jour) {
		case "samedi", "dimanche":
			System.out.println("C'est le weekend");
			break;
		default : 
			System.out.println("On est en semaine (travaille!)");
			break;
		}
		
	}

}
