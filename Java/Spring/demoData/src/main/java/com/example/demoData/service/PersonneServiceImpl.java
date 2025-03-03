package com.example.demoData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoData.entity.Personne;
import com.example.demoData.repository.PersonneRepository;

@Service
class PersonneServiceImpl implements PersonneService {

	@Autowired
	PersonneRepository repo;
	
	@Override
	public void create(Personne personne) throws PersonneServiceException {
		// vérification de contraintes
		if("Dupont".equalsIgnoreCase(personne.getNom())) {
			throw new PersonneServiceException("Pas de Dupont!");
		}
		
		if(personne.getAge() < 18) {
			throw new PersonneServiceException("La personne doit être majeure");
		}
		
		// insertion
		repo.save(personne);

	}

	@Override
	public List<Personne> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Personne> getAllAge(Integer age) {
		return repo.findByAge(age);
	}

}
