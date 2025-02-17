package atelier2.secu;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SecuTest {
	static Secu secu;
	
	@BeforeAll
	static void setupBeforeAll() {
		secu = new Secu();
	}
	
	@Test
	void codeCivilite_homme_retourne1() {
		assertEquals("1", secu.codeCivilite("homme"));
	}
	
	@Test
	void codeCivilite_femme_retourne2() {
		assertEquals("2", secu.codeCivilite("femme"));
	}
	
	@Test
	void codeCivilite_autre_leveException() {
		assertThrows(InvalidParameterException.class, () -> {
			secu.codeCivilite("pouet");
		});
	}
	
	@Test
	void codeAnnee_2012_retourne12() {
		assertEquals("12", secu.codeAnnee(2012));
	}
	
	@Test
	void codeAnnee_2002_retourne02() {
		assertEquals("02", secu.codeAnnee(2002));
	}
	
	@Test
	void codeMois_1_retourne01() {
		assertEquals("01", secu.codeMois(1));
	}
	
	@Test
	void codeMois_12_retourne12() {
		assertEquals("12", secu.codeMois(12));
	}
	
	@Test
	void codeMois_13_leveException() {
		assertThrows(InvalidParameterException.class, () -> {
			secu.codeMois(13);
		});
	}

	@Test
	void calculCode_homme199203_retourne19203() {
		Individu ind = new Individu(LocalDate.of(1992, 3, 1), "homme");
		assertEquals("1 92 03", secu.calculCode(ind));
	}
	
	@Test
	void calculCode_femme199411_retourne29411() {
		Individu ind = new Individu(LocalDate.of(1994, 11, 11), "femme");
		assertEquals("2 94 11", secu.calculCode(ind));
	}
}
