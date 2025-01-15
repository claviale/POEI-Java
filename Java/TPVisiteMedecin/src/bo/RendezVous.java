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
		return "RendezVous [creneau=" + creneau + ", patient=" + patient + ", date=" + date + "]";
	}
	

}
