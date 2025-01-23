package heritage;

public class Oiseau extends Animal {
	private boolean volant;
	
	public Oiseau(String nom, boolean volant) {
		super(nom);
		this.volant = volant;
	}

	public boolean isVolant() {
		return volant;
	}

	public void setVolant(boolean volant) {
		this.volant = volant;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "\n\t";
		if (volant) {
			result += "Est capable de voler";
		} else {
			result += "Ne peut pas voler";
		}
		return result;
	}
}
