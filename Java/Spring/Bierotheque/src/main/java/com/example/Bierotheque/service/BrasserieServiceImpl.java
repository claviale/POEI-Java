package com.example.Bierotheque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bierotheque.entity.Brasserie;
import com.example.Bierotheque.repository.BrasserieRepository;

@Service
class BrasserieServiceImpl implements BrasserieService {
	
	@Autowired
	BrasserieRepository repo;
	
	@Override
	public void create(Brasserie brasserie) throws BrasserieServiceException {
		repo.save(brasserie);
	}

	@Override
	public List<Brasserie> getAll() {
		return repo.findAll();
	}
	
}
