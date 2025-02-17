package atelier1.stringmanips;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class StringManipulationTest {
	static StringManipulation sm;
	
	@BeforeAll
	static void setupBeforeAll() {
		sm = new StringManipulation();
	}
	
	// Concatenation
	
	@Test
	void concatenation_HelloEtWorld_donneHelloWorld() {
		String resultat = sm.concatenation("Hello", "World");
		assertEquals("HelloWorld", resultat);
	}
	
	@Test
	void concatenation_HelloEtVide_donneHello() {
		String resultat = sm.concatenation("Hello", "");
		assertEquals("Hello", resultat);
	}
	
	@Test
	void concatenation_DeuxChainesVides_donneChaineVide() {
		String resultat = sm.concatenation("", "");
		assertEquals("", resultat);
	}
	
	// Zip
	
	@Test
	void zip_DeuxChaines_donneChaineZip() {
		String resultat = sm.zip("Hello", "World");
		assertEquals("HWeolrllod", resultat);
	}
	
	@Test
	void zip_DeuxChainesVides_donneChaineVide() {
		String resultat = sm.zip("", "");
		assertEquals("", resultat);
	}
	
	@Test
	void zip_DeuxChainesDeTaillesDifferentes() {
		String resultat = sm.zip("Hello Hello", "World");
		assertEquals("HWeolrllod Hello", resultat);
	}
	
	@Test
	void zip_totoEtPouet_leveException() {
		InvalidParameterException ipe = assertThrows(InvalidParameterException.class, () -> {
			sm.zip("toto", "pouet");
		});
		
		assertEquals("Les deux chaines de caracteres ne font pas la meme taille !", ipe.getMessage());
	}
	
	// Reverse
	
	@Test
	void reverse_chaine_donneChaineReverse() {
		String resultat = sm.reverse("Hello");
		assertEquals("olleH", resultat);
	}
	
	@Test
	void reverse_chaineVide_donneChaineVide() {
		String resultat = sm.reverse("");
		assertEquals("", resultat);
	}
	
	@Test
	void reverse_uneChaineNull() {
		String resultat = sm.reverse(null);
		assertEquals("", resultat);
	}
	
	@Test
	void reverse_null_leveException() {
		InvalidParameterException ipe = assertThrows(InvalidParameterException.class, () -> {
			sm.reverse(null);
		});
		
		assertEquals("La chaine ne peut pas etre null", ipe.getMessage());
	}
	
	// Caps
	
	@Test
	void caps_uneChaine_donneUneChaineCaps() {
		String resultat = sm.caps("hello");
		assertEquals("HELLO", resultat);
	}
	
	@Test
	void caps_uneChaineVide_donneUneChaineVide() {
		String resultat = sm.caps("");
		assertEquals("", resultat);
	}
	
	@Test
	void caps_uneChaineCaps_donneUneChaineCaps() {
		String resultat = sm.caps("HELLO");
		assertEquals("HELLO", resultat);
	}
	
	@Test
	void caps_null_leveException() {
		InvalidParameterException ipe = assertThrows(InvalidParameterException.class, () -> {
			sm.caps(null);
		});
		
		assertEquals("La chaine ne peut pas etre null", ipe.getMessage());
	}
	
	// Substring
	
	@Test
	void substring_HelloEntreIndex1et4_donneEll() {
		String resultat = sm.substring("hello", 1, 4);
		assertEquals("ell", resultat);
	}
	
	@Test
	void substring_ChaineVideEntreIndex1et4() {
		String resultat = sm.substring("", 1, 4);
		assertEquals("", resultat);
	}
	
	@Test
	void substring_helloworldmoins2a8_leveException() {
		InvalidParameterException ipe = assertThrows(InvalidParameterException.class, () -> {
			sm.substring("helloworld", -2, 8);
		});
		
		assertEquals("La borne inferieure ne peut pas etre negative", ipe.getMessage());
	}
	
	@Test
	void substring_helloworld8a2_leveException() {
		InvalidParameterException ipe = assertThrows(InvalidParameterException.class, () -> {
			sm.substring("helloworld", 8, 2);
		});
		
		assertEquals("La borne supérieure ne peut pas etre plus petite que la borne inférieure", ipe.getMessage());
	}
	
	@Test
	void substring_helloworld2a200_leveException() {
		InvalidParameterException ipe = assertThrows(InvalidParameterException.class, () -> {
			sm.substring("helloworld", 2, 200);
		});
		
		assertEquals("La borne superieure ne peut pas etre plus grande que la chaine", ipe.getMessage());
	}
}
