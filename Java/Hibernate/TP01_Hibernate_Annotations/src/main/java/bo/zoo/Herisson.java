package bo.zoo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table(name = "herissons")
@DiscriminatorValue("herisson")
public class Herisson extends Animal {
	
	private int nbAiguilles;
	
	public Herisson() {}

	public int getNbAiguilles() {
		return nbAiguilles;
	}

	public void setNbAiguilles(int nbAiguilles) {
		this.nbAiguilles = nbAiguilles;
	}
	
}
