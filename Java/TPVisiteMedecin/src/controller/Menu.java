package controller;

import java.util.Scanner;

import bo.Adresse;
import bo.MedecinGeneraliste;

public class Menu {

	public static void main(String[] args) {
		
		MedecinGeneraliste doctor1 = new MedecinGeneraliste("Watson", "John", "07.89.55.66.88", new Adresse(10, "rue", "Réformes (des)", "44100", "Nantes"));
		MedecinGeneraliste doctor2 = new MedecinGeneraliste("Scully", "Dana", "07.89.96.10.45", new Adresse(15, "rue", "Camélias (des)", "44300", "Nantes"));
		MedecinGeneraliste doctor3 = new MedecinGeneraliste("Dorian", "John", "07.33.25.68.74", new Adresse(30, "avenue", "Goblins (des)", "44000", "Nantes"));
		
		
		Scanner scan = new Scanner(System.in);
		int choix;
		do {
			System.out.println("Quelle opération souhaitez-vous réaliser :");
			System.out.println("1. Consulter les médecins");
			System.out.println("2. Ajouter un médecin");
			System.out.println("3. Modifier un médecin");
			System.out.println("4. Exit");
			
			
			choix = scan.nextInt();
			
			switch(choix) {
			case 1 : 
				System.out.println(doctor1.toString());
				System.out.println(doctor2.toString());
				System.out.println(doctor3.toString());
				break;
			case 2 :
				System.out.println("non");
				break;
			case 3 :
				System.out.println("nuuion");
				break;
			case 4:
                System.out.println("Exiting...");
                break;
			default :
				System.out.println("Ceci n'est pas un choix valide.");
				break;		
			}
		} while (choix != 4);
		scan.close();
	}
}
