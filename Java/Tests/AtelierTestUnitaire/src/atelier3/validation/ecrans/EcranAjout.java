package atelier3.validation.ecrans;

import java.util.Scanner;

import atelier3.validation.bo.Stock;
import atelier3.validation.util.ScannerUtil;

public class EcranAjout extends Ecran {

	@Override
	public void afficher() {
		System.out.println("Ajout d'un article");
	}

	@Override
	public int realiserAction() throws Exception {
		boolean ajoutOK;
		do {
			Scanner scan = ScannerUtil.get();
			System.out.println("Veuillez saisir le nom de l'article à ajouter");
			String nomArticle = scan.nextLine();
			System.out.println("Veuillez saisir la quantite a ajouter");
			int qtt = scan.nextInt();
			ajoutOK = Stock.ajouterArticle(nomArticle, qtt);
		} while (!ajoutOK);
		return 0;
	}

}
