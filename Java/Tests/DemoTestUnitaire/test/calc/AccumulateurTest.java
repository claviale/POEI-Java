package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccumulateurTest {
	static Accumulateur acc;
	
	//@BeforeAll
	//static void setUpBeforeClass() throws Exception {
	//	acc = new Accumulateur();
	//}
	
	@BeforeEach
	void setUpBeforeEach() {
		acc = new Accumulateur();
	}
	
	@Test
	void incrementer_10fois_vaut10() { // test d'intégration car 2 fonctionnalités
		for (int i = 0; i < 10; i++) {
			acc.incrementer();
		}
		assertEquals(10, acc.getValeur());
	}
	
	@Test
	void incrementer_100fois_vaut100() {
		for (int i = 0; i < 100; i++) {
			acc.incrementer();
		}
		assertEquals(100, acc.getValeur());
	}
	
	@Test
	void reinitialiser_multiplesIncrementsEtReinitialisations() {
		for (int i = 0; i < 13; i++) {
			acc.incrementer();
		}
		assertEquals(13, acc.getValeur());
		
		acc.reinitialiser();
		assertEquals(0, acc.getValeur());
		
		for (int i = 0; i < 31; i++) {
			acc.incrementer();
		}
		
		assertEquals(31, acc.getValeur());
		
		acc.reinitialiser();
		assertEquals(0, acc.getValeur());
		
		acc.reinitialiser();
		assertEquals(0, acc.getValeur());
		
	}

}
