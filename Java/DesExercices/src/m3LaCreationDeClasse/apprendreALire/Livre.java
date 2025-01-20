package m3LaCreationDeClasse.apprendreALire;

public class Livre {
	private String titre;
	private int nbPages;
	private String[] pages;
	
	private int index = 0;
	
	
	public Livre(String titre, int nbPages) {
		this.titre = titre;
		this.nbPages = nbPages;
		this.pages = new String[nbPages];
	}
	
	public void ajouterPage(String nouvellePage) {
		pages[index] = nouvellePage;
		index++;
	}
	
	public String consulterPage(int index) {
		return pages[index];
		
	}

	@Override
	public String toString() {
		String result = titre;
		result += " (" + nbPages + " pages)\n";
		for (String page : pages) {
			result += page + "\n";
		}
		return result;
	}
	
	
	
	
	
}
