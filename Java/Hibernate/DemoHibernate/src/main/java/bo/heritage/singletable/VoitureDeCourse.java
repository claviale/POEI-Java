package bo.heritage.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "voituredecourseST")
@DiscriminatorValue("course")
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
