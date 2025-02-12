package bo.zoo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table(name = "paresseux")
@DiscriminatorValue("paresseux")
public class Paresseux extends Animal {
	
	private boolean endormi;
	
	public Paresseux() {}

	public boolean isEndormi() {
		return endormi;
	}

	public void setEndormi(boolean endormi) {
		this.endormi = endormi;
	}
	
}
