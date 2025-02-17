package calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatriceTest {
	static Calculatrice calc;
	
	@BeforeAll
	static void setupBeforeAll() {
		calc = new Calculatrice();
	}
	
	@Test
	void additionner_5et2_donne7() {
		int resultat = calc.additionner(5, 2);
		assertEquals(7, resultat);
	}
	
	@Test
	void additionner_5etMoins3_donne2() {
		int resultat = calc.additionner(5, -3);
		assertEquals(2, resultat); 
	}
}
