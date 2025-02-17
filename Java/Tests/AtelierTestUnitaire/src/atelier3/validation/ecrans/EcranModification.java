package atelier3.validation.ecrans;

import java.util.Scanner;

import atelier3.validation.bo.Stock;
import atelier3.validation.util.ScannerUtil;

public class EcranModification extends Ecran {

	@Override
	public void afficher() {
		System.out.println("Modification d'un article");
	}

	@Override
	public int realiserAction() throws Exception {
		boolean modifOK;
		do {
			Scanner scan = ScannerUtil.get();
			System.out.println("Veuillez saisir le nom de l'article à modifier");
			String nomArticle = scan.nextLine();
			System.out.println("Veuillez saisir la quantite a ajouter");
			int qtt = scan.nextInt();
			modifOK = Stock.modifierArticle(nomArticle, qtt);
		} while (!modifOK);
		return 0;
	}

}
