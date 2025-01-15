package test;

import java.time.LocalDate;

import bo.Adresse;
import bo.Patient;

public class TestPatient {
	
	public static void main(String[] args) {
		Adresse ad1 = new Adresse(88, "rue", "Huits (des)", "44000", "Nantes");
		Adresse ad2 = new Adresse(55, "rue", "Cinqs (des)", "44100", "Nantes");
		Adresse ad3 = new Adresse(33, "rue", "Trois (des)", "44300", "Nantes");
		
		//Création de 3 patients
		Patient patient1 = new Patient("Holly", "Georges", "07.89.55.66.88", 'M', 1528566958888L, LocalDate.of(1990, 5, 15), "allergie au lactose", ad1);
		Patient patient2 = new Patient("Durand", "Laura", "07.89.96.10.45", 'F', 1528566958888L, LocalDate.of(1990, 5, 15), null, ad2);
		Patient patient3 = new Patient("Smith", "John", "07.33.25.68.74", 'M', 1528566958888L, LocalDate.of(1990, 5, 15), ad3);
		
		//Affichage des 3 patients
		System.out.println(patient1.toString());
		System.out.println(patient2.toString());
		System.out.println(patient3.toString());

	}
}
