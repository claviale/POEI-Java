package com.example.demoWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoWS.entity.Velo;
import com.example.demoWS.repository.VeloRepository;

@Service
public class VeloServiceImpl implements VeloService {

	@Autowired
	VeloRepository repo;
	
	@Override
	public void create(Velo velo) {
		repo.save(velo);
	}

	@Override
	public void update(Velo velo) {
		repo.save(velo);
	}

	@Override
	public void delete(Velo velo) {
		repo.delete(velo);
	}

	@Override
	public List<Velo> getAll() {
		return repo.findAll();
	}

	@Override
	public Velo getById(Integer id) throws VeloServiceException {
		Optional<Velo> velo = repo.findById(id);
		if(velo.isPresent()) {
			return velo.get();
		}
		else {
			throw new VeloServiceException("Cette identifiant n'existe pas");
		}
	}

}
