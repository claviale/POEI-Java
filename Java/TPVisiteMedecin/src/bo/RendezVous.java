package bo;

import java.time.LocalDate;

public class RendezVous {
	private Creneau creneau;
	private Patient patient;
	private LocalDate date;
	
	public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
	}

	@Override
	public String toString() {
		String result = "";
		
		result += "Rendez-vous du " 
					+ date 
					+ " à " 
					+ creneau.getTime() 
					+ " (" 
					+  creneau.getDuration()
					+ " minutes)"
					+ "\n";
		
		result += "avec le Dr " + creneau.getMedecin().getLastName() + "\n";
		result += "Patient :  \n" + patient;
		result += "A l'adresse :\n" + creneau.getMedecin().getAdress();
		
		return result;
	}
}
