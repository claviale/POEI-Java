package bo;

import java.time.LocalTime;

public class Creneau {

	private LocalTime time;
	private int duration;
	private MedecinGeneraliste medecin;
	
	public Creneau(LocalTime time, int duration, MedecinGeneraliste medecin) {
		this.time = time;
		this.duration = duration;
		this.medecin = medecin;
	}
	
	public Creneau(LocalTime time, int duration) {
		this.time = time;
		this.duration = duration;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public MedecinGeneraliste getMedecin() {
		return medecin;
	}

	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}

	@Override
	public String toString() {
		return "Creneau [time=" + time + ", duration=" + duration + ", medecin=" + medecin.getLastName() + "]";
	}
	
	
	
}
