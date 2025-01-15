package test;

import bo.Adresse;

public class TestAdresse {
	public static void main(String[] args) {
		Adresse adr1 = new Adresse(2, "bis", "rue", "Calvaire (du)", "44300", "Nantes", "oui");
		Adresse adr2 = new Adresse(32, "rue", "Calvaire (du)", "44300", "Nantes");
		
		adr1.display();
		adr2.display();
	}
}
