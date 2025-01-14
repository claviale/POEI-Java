package test;

import java.time.LocalDate;
import bo.Patient;

public class TestPatient {
	
	public static void main(String[] args) {
		
		//Création de 3 patients
		Patient patient1 = new Patient("Holly", "Georges", "07.89.55.66.88", 'M', 152856695, LocalDate.of(1990, 5, 15), "ras");
		Patient patient2 = new Patient("Durand", "Laura", "07.89.96.10.45", 'F', 152856695, LocalDate.of(1990, 5, 15), "ras");
		Patient patient3 = new Patient("Smith", "John", "07.33.25.68.74", 'M', 152856695, LocalDate.of(1990, 5, 15), "ras");
		
		//Affichage des 3 patients
		patient1.display();
		patient2.display();
		patient3.display();

	}
}
