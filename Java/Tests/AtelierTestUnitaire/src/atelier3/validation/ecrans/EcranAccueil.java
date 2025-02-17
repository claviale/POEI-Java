package atelier3.validation.ecrans;

import java.util.Scanner;

import atelier3.validation.util.ScannerUtil;

public class EcranAccueil extends Ecran {

	@Override
	public void afficher() {
		System.out.println("Bienvenue sur votre application de gestion de stock");
		System.out.println("Veuillez selectionner l'operation souhaitee :");
		System.out.println("1. Consulter le stock");
		System.out.println("2. Modifier un article");
		System.out.println("3. Ajouter un article");
		System.out.println("4. Quitter l'application");
	}

	@Override
	public int realiserAction() throws Exception {
		Scanner scan = ScannerUtil.get();
		int choix = scan.nextInt();
		if (choix < 1 || choix > 4) {
			throw new Exception("La valeur saisie est incorrecte");
		}
		return choix;
	}

}
