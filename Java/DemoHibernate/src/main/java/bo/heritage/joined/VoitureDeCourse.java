package bo.heritage.joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "voituredecourseJ") @Table(name = "voituresdecourseJ")
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
