package com.example.demoData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoData.entity.Maison;
import com.example.demoData.repository.MaisonRepository;

@Service
class MaisonServiceImpl implements MaisonService {

	
	@Autowired
	MaisonRepository repo;
	
	@Override
	public void create(Maison maison) throws MaisonServiceException {
		repo.save(maison);
	}

	@Override
	public List<Maison> getAll() {
		return repo.findAll();
	}

}
