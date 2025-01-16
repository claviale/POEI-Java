package test;

import bo.Adresse;
import bo.MedecinGeneraliste;

public class TestMedecin {
	
	public static void main(String[] args) {
		
		Adresse adr1 = new Adresse(10, "rue", "Réformes (des)", "44100", "Nantes");
		
		//Création des 3 médecins
		MedecinGeneraliste doctor1 = new MedecinGeneraliste("Watson", "John", "07.89.55.66.88", adr1);
		MedecinGeneraliste doctor2 = new MedecinGeneraliste("Scully", "Dana", "07.89.96.10.45", new Adresse(15, "rue", "Camélias (des)", "44300", "Nantes"));
		MedecinGeneraliste doctor3 = new MedecinGeneraliste("Dorian", "John", "07.33.25.68.74", new Adresse(30, "avenue", "Goblins (des)", "44000", "Nantes"));
		
		//Affectation du tarif initial de la consultation
		MedecinGeneraliste.setTarif(25);
		System.out.println("Prix de la consultation : " + MedecinGeneraliste.getTarif() + " €");
		
		//Affichage des 3 médecins
		System.out.println(doctor1.toString());
		System.out.println(doctor2.toString());
		System.out.println(doctor3.toString());

		//Mise à jour du numéro de téléphone d'un des médecins
		doctor1.setPhoneNumber("06.89.55.66.90");
		System.out.println("Nouveau numéro renseigné pour Dr " + doctor1.getLastName() + " : " + doctor1.getPhoneNumber());
		
		//Mise à jour du prix de consultation des médecins
		MedecinGeneraliste.setTarif(30);
		System.out.println("Nouveau tarif de consultation depuis le 01/11/24 : " + MedecinGeneraliste.getTarif() + " €");
		
		//Nouvel affichage des 3 médecins
		System.out.println("Mise à  jour des coordonnées des médecins :");
		System.out.println(doctor1.toString());
		System.out.println(doctor2.toString());
		System.out.println(doctor3.toString());
		
		
	}
}
