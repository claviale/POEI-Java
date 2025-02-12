package bo.zoo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table(name = "renards")
@DiscriminatorValue("renard")
public class Renard extends Animal {
	
	private String couleur;
	
	public Renard() {}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
