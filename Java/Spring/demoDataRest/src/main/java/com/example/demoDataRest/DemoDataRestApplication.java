package com.example.demoDataRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demoDataRest.entity.Personne;
import com.example.demoDataRest.repository.PersonneRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoDataRestApplication {
	
	@Autowired
	PersonneRepository repo;
	
	@PostConstruct
	public void init() {
		repo.save(Personne.builder().nom("Cérien").prenom("Jean").build());
		repo.save(Personne.builder().nom("Terrieur").prenom("Alain").build());
		repo.save(Personne.builder().nom("Terrieur").prenom("Jean").build());
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDataRestApplication.class, args);
	}

}
