package atelier2.secu;

import java.time.LocalDate;

public class Individu {
	private LocalDate dateNaissance;
	private String civilite;
	
	public Individu(LocalDate dateNaissance, String civilite) {
		this.dateNaissance = dateNaissance;
		this.civilite = civilite;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
}
