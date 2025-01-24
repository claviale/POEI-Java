package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import bll.ComposantBLL;
import bo.Composant;
import exceptions.ComposantException;

public class ComposantController {
	
	public int showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("\tQuel action souhaitez-vous réaliser ? ");
        System.out.println("------------------------------------------------------\n");
        System.out.println("1. Ajouter un nouveau composant");
        System.out.println("2. Consulter les composants déjà enregistrés");
        System.out.println("3. Supprimer un composant");
        System.out.println("4. Quitter l'application");
       
        return scanner.nextInt();    
    }
	

    public void createProduct(){
    	ComposantBLL composantBLL = new ComposantBLL();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Pour créer un nouveau composant, saisissez les informations suivantes : ");
            System.out.println("Nom du composant : ");
            String nom = scanner.nextLine();
            
            System.out.println("Nature du composant : ");
            String nature = scanner.nextLine();
            
            System.out.println("Date de sortie du composant : ");
            String dateInput = scanner.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("[d/M/y][y-M-d]");
            LocalDate dateSortie = LocalDate.parse(dateInput, dtf);
            
            Composant composant = composantBLL.insert(nom, nature, dateSortie);
			System.out.println("Insertion réussie :");
			System.out.println(composant);

        } catch (ComposantException e) {
			System.err.println("La création du composant à échoué :");
			System.err.println(e.getMessage());
        }
    }

    public void showAll() {
    	ComposantBLL composantBLL = new ComposantBLL();
    	List<Composant> composants = composantBLL.select();
    	System.out.println("Liste des composants :");
    	for (Composant current : composants) {
    		System.out.println(current);
    	}
    }

    
    public void delete() {
    	ComposantBLL composantBLL = new ComposantBLL();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saisissez le numéro du composant à supprimer :  ");
        int id = scanner.nextInt();
        composantBLL.delete(id);
        System.out.println("Composant supprimé !");
        System.out.println("Mise à jour de la liste des composants...");
        showAll();
       
    }

	
}
