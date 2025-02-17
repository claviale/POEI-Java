package bll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import entities.Film;
import entities.Realisateur;
import entities.Style;

class FilmBLLTest {
	static FilmBLL filmbll;
	static StyleBLL stylebll;
	
	@BeforeAll
	static void setUpBeforeAll() {
		filmbll = new FilmBLL();
		stylebll = new StyleBLL();
	}
	
	@Test
	void insert_filmValide_doitEnregistrerEnBDD() {
		Film film = new Film();
		film.setTitre("Test");
		film.setAnnee(2025);
		film.setDuree(120);
		film.setVu(true);
		film.setSynopsis("Un film qu'il est bien");
		
		Realisateur realisateur = new Realisateur();
		realisateur.setNom("muche");
		realisateur.setPrenom("muche");
		film.setRealisateur(realisateur);
		
		Style style = stylebll.selectById(1);
		film.setStyle(style);
		
		try {
			filmbll.insert(film);
		} catch (FilmException e) {
			fail("Le film inséré aurait du être valide!");
		}
		
		assertNotEquals(0, film.getId());
		assertNotEquals(0, realisateur.getId());
	}
	
	@Test
	void insert_filmKO_leveException() {
		Film film = new Film();
		film.setAnnee(2025);
		film.setDuree(120);
		film.setVu(true);
		film.setSynopsis("Un film qu'il est bien");
		
		Realisateur realisateur = new Realisateur();
		realisateur.setNom("muche");
		realisateur.setPrenom("muche");
		film.setRealisateur(realisateur);
		
		Style style = stylebll.selectById(1);
		film.setStyle(style);
		FilmException fe = assertThrows(FilmException.class, () -> {
			filmbll.insert(film);
		});
		
		assertEquals("Le film doit avoir un titre de renseigné", fe.getMessage());
	}
	
	

}
