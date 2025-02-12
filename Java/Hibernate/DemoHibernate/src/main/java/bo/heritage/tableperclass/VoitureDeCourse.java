package bo.heritage.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "voituredecourseTPC") @Table(name = "voituresdecourseTPC")
public class VoitureDeCourse extends Voiture {
	private String ecurie;
	
	public VoitureDeCourse() {}

	public String getEcurie() {
		return ecurie;
	}

	public void setEcurie(String ecurie) {
		this.ecurie = ecurie;
	}
	
}
