package atelier3.validation.ecrans;

import atelier3.validation.bo.Stock;

public class EcranConsultation extends Ecran {

	@Override
	public void afficher() {
		for (String line : Stock.getDisplayStock()) {
			System.out.println(" > " + line);
		}
	}

	@Override
	public int realiserAction() throws Exception {
		return 0;
	}

}
