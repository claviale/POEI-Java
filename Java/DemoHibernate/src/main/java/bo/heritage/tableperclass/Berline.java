package bo.heritage.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "berlineTPC") @Table(name = "berlinesTPC")

public class Berline extends Voiture {
	
	@Column(name = "couleur_cuir")
	private String couleurCuir;

	public Berline() {}

	public String getCouleurCuir() {
		return couleurCuir;
	}

	public void setCouleurCuir(String couleurCuir) {
		this.couleurCuir = couleurCuir;
	}
	
	
}
