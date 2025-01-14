package visibilite.jeu;

public class TestDe {
	public static void main(String[] args) {
		// constructeur par défault
		// De monDe = new De();
		// monDe.setNbFaces(6);
		
		// contructeur qu'on a créé
		De monDe = new De(6);
		
		De de12 = new De(12);
		
		System.out.println(monDe.getNbFaces());
		System.out.println(de12.getNbFaces());
		
		// On lance le dé et récupère un résultat random
		monDe.lancer();
		System.out.println(monDe.getResultat());
		
		// On lance le dé jusqu'à obtenir un 6
		do {
			monDe.lancer();
			System.out.println(monDe.getResultat());
			
		} while (monDe.getResultat() != 6);
	}
}
