package test;

import java.time.LocalDate;
import java.time.LocalTime;

import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;

public class TestMedecin {
	
	public static void main(String[] args) {
		
		Adresse ad1 = new Adresse(10, "rue", "Réformes (des)", "44100", "Nantes");
		Creneau creneau1 = new Creneau((LocalTime.of(9, 0)), 15);
		Creneau creneau2 = new Creneau((LocalTime.of(9, 30)), 15);
		Creneau creneau3 = new Creneau((LocalTime.of(9, 45)), 15);
		
		//Création des 3 médecins
		MedecinGeneraliste doctor1 = new MedecinGeneraliste("Watson", "John", "07.89.55.66.88", ad1);
		MedecinGeneraliste doctor2 = new MedecinGeneraliste("Scully", "Dana", "07.89.96.10.45", new Adresse(15, "rue", "Camélias (des)", "44300", "Nantes"));
		MedecinGeneraliste doctor3 = new MedecinGeneraliste("Dorian", "John", "07.33.25.68.74", new Adresse(30, "avenue", "Goblins (des)", "44000", "Nantes"));
		
		//Affectation du tarif initial de la consultation
		MedecinGeneraliste.setConsultationPrice(25);
		System.out.println("Prix de la consultation : " + MedecinGeneraliste.getConsultationPrice() + " €");
		
		//Affichage des 3 médecins
		System.out.println(doctor1.toString());
		System.out.println(doctor2.toString());
		System.out.println(doctor3.toString());

		//Mise à jour du numéro de téléphone d'un des médecins
		doctor1.setPhoneNumber("06.89.55.66.90");
		System.out.println("Nouveau numéro renseigné pour Dr " + doctor1.getLastName() + " : " + doctor1.getPhoneNumber());
		
		//Mise à jour du prix de consultation des médecins
		MedecinGeneraliste.setConsultationPrice(30);
		System.out.println("Nouveau tarif de consultation depuis le 01/11/24 : " + MedecinGeneraliste.getConsultationPrice() + " €");
		
		//Nouvel affichage des 3 médecins
		System.out.println("Mise à  jour des coordonnées des médecins :");
		System.out.println(doctor1.toString());
		System.out.println(doctor2.toString());
		System.out.println(doctor3.toString());
		
		//Ajouter créneau a un docteur
		doctor1.ajouterCreneaux(creneau1, creneau2, creneau3);
		
		System.out.println(doctor1.toString());
		
	}
}
