package atelier3.validation;

import java.util.HashMap;
import java.util.Map;

import atelier3.validation.ecrans.Ecran;
import atelier3.validation.ecrans.EcranAccueil;
import atelier3.validation.ecrans.EcranAjout;
import atelier3.validation.ecrans.EcranConsultation;
import atelier3.validation.ecrans.EcranModification;
import atelier3.validation.util.ScannerUtil;

public class GestionnaireDEcrans {
	Map<Integer, Ecran> ecrans;
	
	public GestionnaireDEcrans() {
		ecrans = new HashMap<>();
		ecrans.put(0, new EcranAccueil());
		ecrans.put(1, new EcranConsultation());
		ecrans.put(2, new EcranModification());
		ecrans.put(3, new EcranAjout());
	}
	
	public void demarrer() {
		int choix = 0;
		while (choix != 4) {
			Ecran ecranActuel = ecrans.get(choix);
			ecranActuel.afficher();
			try {
				choix = ecranActuel.realiserAction();
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
				choix = 0;
			}
		}
		ScannerUtil.close();
		System.out.println("Bye bye");
	}
}
