package association_bidirectionnelle;

public class TestAssociationBidirectionnelle {
	public static void main(String[] args) {
		
		Eleve neo = new Eleve("Neo");
		Eleve trinity = new Eleve("Trinity");
		Eleve morpheus = new Eleve("Morpheus");
		Eleve loracle = new Eleve("Loracle");
		Eleve smith = new Eleve("Smith");
		
		Groupe matrix = new Groupe("Matrix");
		
		matrix.ajouterEleve(neo);
		//neo.setGroupe(matrix);
		matrix.ajouterEleve(trinity);
		matrix.ajouterEleve(morpheus);
		matrix.ajouterEleve(loracle);
		matrix.ajouterEleve(smith);
		
		System.out.println(matrix);
	}
}
