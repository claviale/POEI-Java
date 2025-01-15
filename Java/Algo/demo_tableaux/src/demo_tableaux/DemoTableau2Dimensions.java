package demo_tableaux;

public class DemoTableau2Dimensions {

	public static void main(String[] args) {
		//tableau de 5 lignes et 5 colonnes
		char[][] carte = new char[5][5];
		carte[0][0] = 'P';
		
		// ou 
		carte = new char [][]{
				{'P','P','P','P','R'},
				{'P','P','P','R','D'},
				{'P','P','R','D','D'},
				{'P','R','D','D','D'},
				{'R','D','D','D','A'},
		};
		
		for (char[] ligne : carte) {
			for (char cellule : ligne) {
				switch(cellule) {
				case 'P' : 
					System.out.print("\u001B[42m   ");
					break;
				case 'R' : 
					System.out.print("\u001B[44m   ");
					break;
				case 'D' : 
					System.out.print("\u001B[43m   ");
					break;
				default : 
					System.out.print("\u001B[40m   ");
					break;
					
				}
			}
			//retour à la ligne
			System.out.println();
		}
	}
}
