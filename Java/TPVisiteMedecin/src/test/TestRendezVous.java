package test;

import java.time.LocalDate;
import java.time.LocalTime;

import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;
import bo.MedecinSpecialiste;
import bo.Patient;
import bo.RendezVous;

public class TestRendezVous {
	public static void main(String[] args) {
		
		Adresse adr = new Adresse(15, "rue", "Camélias (des)", "44300", "Nantes");
		
		MedecinSpecialiste scully = new MedecinSpecialiste("Scully", "Dana", "07.89.96.10.45", adr, 80, "Kine");
		MedecinGeneraliste watson = new MedecinGeneraliste("Watson", "John", "07.89.55.66.88", adr);
		
		MedecinGeneraliste.setTarif(25);
		
		Patient patient1 = new Patient("Holly", "Georges", "07.89.55.66.88", adr, 'M', 1528566958888L, LocalDate.of(1990, 5, 15), "allergie au lactose");
		Patient patient2 = new Patient("Durand", "Laura", "07.89.96.10.45", adr, 'F', 1528566958888L, LocalDate.of(1990, 5, 15), null);
		
		Creneau cs1 = new Creneau(LocalTime.of(9, 0), 15, scully);
		Creneau cs2 = new Creneau(LocalTime.of(9, 15), 15, scully);
		Creneau cs3 = new Creneau(LocalTime.of(9, 30), 15, scully);
		Creneau cs4 = new Creneau(LocalTime.of(9, 45), 15, scully);
		Creneau cs5 = new Creneau(LocalTime.of(10, 30), 15, scully);
		
		
		Creneau cw1 = new Creneau(LocalTime.of(9, 15), 15, watson);
		Creneau cw2 = new Creneau(LocalTime.of(9, 30), 15, watson);
		Creneau cw3 = new Creneau(LocalTime.of(9, 45), 15, watson);
		Creneau cw4 = new Creneau(LocalTime.of(10, 30), 15, watson);
		Creneau cw5 = new Creneau(LocalTime.of(10, 45), 15, watson);
		
		
		RendezVous rdv1 = new RendezVous(cs1, patient1, LocalDate.of(2025, 1, 17));
		RendezVous rdv2 = new RendezVous(cw3, patient2, LocalDate.of(2025, 1, 17));

		System.out.println(rdv1);
		System.out.println("*********************");
		System.out.println(rdv2);
		
		System.out.println(scully);
		System.out.println(watson);
	
	}
}
