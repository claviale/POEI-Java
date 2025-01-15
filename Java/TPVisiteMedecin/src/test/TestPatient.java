package test;

import java.time.LocalDate;
import bo.Patient;

public class TestPatient {
	
	public static void main(String[] args) {
		
		//Création de 3 patients
		Patient patient1 = new Patient("Holly", "Georges", "07.89.55.66.88", 'M', 1528566958888L, LocalDate.of(1990, 5, 15), "allergie au lactose");
		Patient patient2 = new Patient("Durand", "Laura", "07.89.96.10.45", 'F', 1528566958888L, LocalDate.of(1990, 5, 15), null);
		Patient patient3 = new Patient("Smith", "John", "07.33.25.68.74", 'M', 1528566958888L, LocalDate.of(1990, 5, 15));
		
		//Affichage des 3 patients
		patient1.display();
		patient2.display();
		patient3.display();

	}
}
