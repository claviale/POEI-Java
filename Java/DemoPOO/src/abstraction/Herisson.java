package abstraction;

public class Herisson extends Animal {
	private  int nbAiguilles;
	
	public Herisson(String nom, int nbAiguilles) {
		super(nom);
		this.nbAiguilles = nbAiguilles;
	}
	
	@Override
	public String crier() {
		return "Couiiii";
	}
	
	public int getNbAiguilles() {
		return nbAiguilles;
	}

	public void setNbAiguilles(int nbAiguilles) {
		this.nbAiguilles = nbAiguilles;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "\n\t";
		result += "Nombre d'aiguilles : " + nbAiguilles;
		
		return result;
	}
	
}
