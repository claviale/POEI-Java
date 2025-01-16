package test;

import java.time.LocalTime;

import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;

public class TestAssociationCreneaux {
	public static void main(String[] args) {
		
		Adresse adr = new Adresse(15, "rue", "Camélias (des)", "44300", "Nantes");
		MedecinGeneraliste scully = new MedecinGeneraliste("Scully", "Dana", "07.89.96.10.45", adr);
		
		MedecinGeneraliste watson = new MedecinGeneraliste("Watson", "John", "07.89.55.66.88", adr);
		
		Creneau creneau1 = new Creneau(LocalTime.of(9, 0), 15, scully);
		new Creneau(LocalTime.of(9, 15), 15, scully);
		new Creneau(LocalTime.of(9, 30), 15, scully);
		new Creneau(LocalTime.of(9, 45), 15, scully);
		new Creneau(LocalTime.of(10, 30), 15, scully);
		new Creneau(LocalTime.of(10, 45), 15, scully);
		new Creneau(LocalTime.of(11, 0), 15, scully);
		new Creneau(LocalTime.of(11, 15), 15, scully);
		new Creneau(LocalTime.of(11, 30), 15, scully);
		new Creneau(LocalTime.of(14, 0), 30, scully);
		new Creneau(LocalTime.of(14, 30), 30, scully);
		new Creneau(LocalTime.of(15, 0), 30, scully);
		new Creneau(LocalTime.of(15, 30), 30, scully);
		new Creneau(LocalTime.of(16, 0), 30, scully);
		new Creneau(LocalTime.of(16, 30), 30, scully);
		
		creneau1.setMedecin(watson);
		watson.ajouterCreneau(creneau1);
		new Creneau(LocalTime.of(9, 15), 15, watson);
		new Creneau(LocalTime.of(9, 30), 15, watson);
		new Creneau(LocalTime.of(9, 45), 15, watson);
		new Creneau(LocalTime.of(10, 30), 15, watson);
		new Creneau(LocalTime.of(10, 45), 15, watson);
		new Creneau(LocalTime.of(11, 0), 15, watson);
		new Creneau(LocalTime.of(11, 15), 15, watson);
		new Creneau(LocalTime.of(11, 30), 15, watson);
		new Creneau(LocalTime.of(14, 0), 30, watson);
		new Creneau(LocalTime.of(14, 30), 30, watson);
		new Creneau(LocalTime.of(15, 0), 30, watson);
		new Creneau(LocalTime.of(15, 30), 30, watson);
		new Creneau(LocalTime.of(16, 0), 30, watson);
		new Creneau(LocalTime.of(16, 30), 30, watson);
		
		creneau1.setDuration(10);
		
		//même instance pour les deux (creneau1) donc modifie l'heure pour les deux médecins
		watson.getCreneaux().get(0).setTime(LocalTime.of(10, 0));
		
		System.out.println(scully);
		System.out.println(watson);
		
	}
}
