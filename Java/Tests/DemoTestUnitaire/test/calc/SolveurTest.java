package calc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SolveurTest {
	static Solveur solveur;
	
	@BeforeAll
	static void setUpBeforeClass() {
		solveur = new Solveur();
	}
	
	@Test
	void isPair_8_retourneVrai() {
		assertTrue(solveur.isPair(8));
	}
	
	@Test
	void isPair_17_retourneFaux() {
		assertFalse(solveur.isPair(17));
	}
	
	@Test
	void isDivByThree_multipleDe3_retourneVrai() {
		Random rand = new Random();
		int nombreATester = rand.nextInt(100) * 3;
		assertTrue(solveur.isDivByThree(nombreATester));
	}
	
	@Test
	void isDivByThree_multipleDe3plus1_retourneFaux() {
		Random rand = new Random();
		int nombreATester = rand.nextInt(100) * 3 + 1;
		assertFalse(solveur.isDivByThree(nombreATester));
	}
	
	@Test
	void isDivByThree_multipleDe3plus2_retourneFaux() {
		Random rand = new Random();
		int nombreATester = rand.nextInt(100) * 3 + 2;
		assertFalse(solveur.isDivByThree(nombreATester));
	}
}
