package com.example.demoData.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demoData.entity.Maison;
import com.example.demoData.repository.MaisonRepository;

@SpringBootTest
class MaisonServiceTests {

	@Autowired
	MaisonService service;
	
	@Autowired
	MaisonRepository repo;
	
	@Test
	public void createTest() throws MaisonServiceException {
		Maison maison = new Maison("Le lieu", "La Selle Craonnaise");
		
		service.create(maison);
		
		List<Maison> lst = repo.findAll();
		assertTrue(lst.size() > 0);
		
	}
}
