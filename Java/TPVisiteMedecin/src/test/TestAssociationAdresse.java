package test;

import java.time.LocalDate;

import bo.Adresse;
import bo.MedecinGeneraliste;
import bo.Patient;

public class TestAssociationAdresse {
	public static void main(String[] args) {
		Adresse adr1 = new Adresse(10, "rue", "Réformes (des)", "44100", "Nantes");
		Adresse adr2 = new Adresse(15, "rue", "Camélias (des)", "44300", "Nantes");
		
		MedecinGeneraliste doctor1 = new MedecinGeneraliste("Watson", "John", "07.89.55.66.88", adr1);
		MedecinGeneraliste doctor2 = new MedecinGeneraliste("Scully", "Dana", "07.89.96.10.45", adr2);
	
		Patient patient1 = new Patient("Holly", "Georges", "07.89.55.66.88", adr1, 'M', 1528566958888L, LocalDate.of(1990, 5, 15), "allergie au lactose");
		Patient patient2 = new Patient("Durand", "Laura", "07.89.96.10.45", adr2, 'F', 1528566958888L, LocalDate.of(1990, 5, 15), null);
		
		System.out.println(doctor1);
		System.out.println(doctor2);
		System.out.println(patient1);
		System.out.println(patient2);
	
	}
}
