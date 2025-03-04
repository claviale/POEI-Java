package com.example.demoData.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demoData.entity.Personne;
import com.example.demoData.repository.PersonneRepository;

@SpringBootTest
public class PersonneServiceTests {
	
	@Autowired
	PersonneService service;
	
	@Autowired
	PersonneRepository repo;
	
	@Test
	public void createTest() throws PersonneServiceException {
		Personne personne = new Personne("Cérien", "Jean", 18);
		
		service.create(personne);
		
		List<Personne> lst = repo.findAll();
		assertTrue(lst.size()>0);
	}
	
	@Test
	public void createTestPasDeDupont() {
		Personne personne = new Personne("Dupont", "Jean", 18);
		
		assertThrows(PersonneServiceException.class, () -> {
			service.create(personne);
		});
	}
	
	@Test
	public void createTestMajeur() {
		Personne personne = new Personne("Tim", "Vincent", 17);
		
		assertThrows(PersonneServiceException.class, () -> {
			service.create(personne);
		});
	}
}
