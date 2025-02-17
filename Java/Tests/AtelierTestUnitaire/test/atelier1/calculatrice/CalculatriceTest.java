package atelier1.calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatriceTest {
	static Calculatrice calc;
	
	@BeforeAll
	static void setupBeforeAll() {
		calc = new Calculatrice();
	}
	
	// Additions 
	@Test
	void additionner_5et2_donne7() {
		int resultat = calc.additionner(5, 2);
		assertEquals(7, resultat);
	}
	
	@Test
	void additionner_0et0_donne0() {
		int resultat = calc.additionner(0, 0);
		assertEquals(0, resultat);
	}
	
	@Test
	void additionner_5etMoins3_donne2() {
		int resultat = calc.additionner(5, -3);
		assertEquals(2, resultat); 
	}
	
	// Soustractions
	
	@Test
	void soustraire_4a10_donne6() {
		int resultat = calc.soustraire(10, 4);
		assertEquals(6, resultat); 
	}
	
	@Test
	void soustraire_0a0_donne0() {
		int resultat = calc.soustraire(0, 0);
		assertEquals(0, resultat); 
	}
	
	@Test
	void soustraire_moins3aMoins2_donne1() {
		int resultat = calc.soustraire(-2, -3);
		assertEquals(1, resultat); 
	}
	
	// Multiplication
	
	@Test
	void multiplier_3et5_donne15() {
		int resultat = calc.multiplier(3, 5);
		assertEquals(15, resultat); 
	}
	
	@Test
	void multiplier_0et2_donne0() {
		int resultat = calc.multiplier(0, 2);
		assertEquals(0, resultat); 
	}
	
	@Test
	void multiplier_moins4et2_donneMoins8() {
		int resultat = calc.multiplier(-4, 2);
		assertEquals(-8, resultat); 
	}
	
	// Division
	
	@Test
	void diviser_6par2_donne3() {
		int resultat = calc.diviser(6, 2);
		assertEquals(3, resultat); 
	}
	
	@Test
	void diviser_moins6par2_donneMoins3() {
		int resultat = calc.diviser(-6, 2);
		assertEquals(-3, resultat); 
	}
	
	@Test
	void diviser_6par0_donne6() {
		ArithmeticException ae = assertThrows(ArithmeticException.class, () -> {
			calc.diviser(6, 0);
		}); 
		
		assertEquals("Division par zero impossible", ae.getMessage());
	}
	
	
	// Modulo 
	
	void modulo_10et3_donne1() {
		int resultat = calc.modulo(10, 3);
		assertEquals(1, resultat); 
	}
	
	void modulo_moins10et3_donne1() {
		int resultat = calc.modulo(-10, 3);
		assertEquals(-1, resultat); 
	}
	
	

}
