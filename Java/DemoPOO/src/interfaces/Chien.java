package interfaces;

public class Chien extends Animal {

	public Chien(String nom) {
		super(nom);
	}

	@Override
	public void dessiner() {
		System.out.println("                                  .-.\r\n"
				+ "     (___________________________()6 `-,\r\n"
				+ "     (   ______________________   /''\"`\r\n"
				+ "     //\\\\                      //\\\\\r\n"
				+ "jgs  \"\" \"\"                     \"\" \"\"");
		
	}

}
