package test;

import bo.MedecinGeneraliste;

public class TestMedecin {
	
	public static void main(String[] args) {
		
		//Création des 3 médecins
		MedecinGeneraliste doctor1 = new MedecinGeneraliste("Watson", "John", "07.89.55.66.88");
		MedecinGeneraliste doctor2 = new MedecinGeneraliste("Scully", "Dana", "07.89.96.10.45");
		MedecinGeneraliste doctor3 = new MedecinGeneraliste("Dorian", "John", "07.33.25.68.74");
		
		//Affectation du tarif initial de la consultation
		MedecinGeneraliste.setConsultationPrice(25);
		System.out.println("Prix de la consultation : " + MedecinGeneraliste.getConsultationPrice() + " €");
		
		//Affichage des 3 médecins
		doctor1.display();
		doctor2.display();
		doctor3.display();

		//Mise à jour du numéro de téléphone d'un des médecins
		doctor1.setPhoneNumber("06.89.55.66.90");
		System.out.println("Nouveau numéro renseigné pour Dr " + doctor1.getLastName() + " : " + doctor1.getPhoneNumber());
		
		//Mise à jour du prix de consultation des médecins
		MedecinGeneraliste.setConsultationPrice(30);
		System.out.println("Nouveau tarif de consultation depuis le 01/11/24 : " + MedecinGeneraliste.getConsultationPrice() + " €");
		
		//Nouvel affichage des 3 médecins
		System.out.println("Mise à  jour des coordonnées des médecins :");
		doctor1.display();
		doctor2.display();
		doctor3.display();
	}
}
