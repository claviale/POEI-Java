package com.example.demoData;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demoData.entity.Caracteristique;
import com.example.demoData.entity.Maison;
import com.example.demoData.entity.Personne;
import com.example.demoData.service.MaisonService;
import com.example.demoData.service.MaisonServiceException;
import com.example.demoData.service.PersonneService;
import com.example.demoData.service.PersonneServiceException;

import jakarta.transaction.Transactional;

@SpringBootTest
class DemoDataApplicationTests {
	@Autowired
	PersonneService personneService;
	
	@Autowired
	MaisonService maisonService;
	
	@Test
	@Transactional
	void contextLoads() throws MaisonServiceException, PersonneServiceException {
		
		Maison leLieu = new Maison("Le lieu", "La Selle Craonnaise");
		
		leLieu.addCar(new Caracteristique("Super beau"));
		leLieu.addCar(new Caracteristique("A la campagne"));
		
		Maison iciPasLa = new Maison("Ici pas là", "Nantes");
		maisonService.create(iciPasLa);
		maisonService.create(leLieu);
		
		Personne jean = new Personne("Cérien", "Jean", 18);
		Personne alex = new Personne("Terrieur", "Alex", 18);
		Personne alain = new Personne("Terrieur", "Alain", 22);
		
		jean.setMaison(iciPasLa);
		alex.setMaison(leLieu);
		alain.setMaison(leLieu);
		
		personneService.create(jean);
		personneService.create(alain);
		personneService.create(alex);
		
		List<Personne> liste = personneService.getAll();
		liste.forEach(System.out::println);
	
		System.out.println();
		List<Personne> memeAge = personneService.getAllAge(18);
		memeAge.forEach(System.out::println);
		
		//System.out.println();
		//repo.findByAge2(18).forEach(System.out::println);
		
		//test des contraintes (nom et age)
		try {
			Personne pierre = new Personne("Dupont", "Pierre", 25);
			personneService.create(pierre);
		} catch (PersonneServiceException e) {
			System.out.println("ERREUR : " + e.getMessage());
		}
		
		try {
			Personne jessy = new Personne("Tropjeune", "Jessy", 15);
			personneService.create(jessy);
		} catch (PersonneServiceException e) {
			System.out.println("ERREUR : " + e.getMessage());
		}
		
	}

}
