package com.example.Bierotheque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bierotheque.entity.Biere;
import com.example.Bierotheque.repository.BiereRepository;

import jakarta.transaction.Transactional;

@Service
class BiereServiceImpl implements BiereService {
	
	@Autowired
	BiereRepository repo;
	
	@Override
	public List<Biere> getAll() {
		return repo.findAll();
	}
	
	@Override
	@Transactional
	public void create(Biere biere) throws BiereServiceException {
		createUpdateConstraints(biere);
		List<Biere> res = repo.findByNomAndBrasserie_Nom(biere.getNom(), biere.getBrasserie().getNom());
		
		if(res.size()>0) {
			throw new BiereServiceException("Une bière avec le même nom et la même brasserie existe déjà.");
		}
		
		repo.save(biere);
	}

	@Override
	@Transactional
	public void update(Biere biere) throws BiereServiceException {
		createUpdateConstraints(biere);
		
		if (!repo.existsById(biere.getIdBiere())) {
			throw new BiereServiceException("Bière non trouvée pour modification");
	    }
		
		repo.save(biere);
	}

	@Override
	@Transactional
	public void delete(Biere biere) throws BiereServiceException {
		if (!repo.existsById(biere.getIdBiere())) {
			throw new BiereServiceException("Bière non trouvée pour suppression");
	    }
		 repo.delete(biere);
	} 
	
	private void createUpdateConstraints(Biere biere) throws BiereServiceException {
		// Contraintes : pas de bière de type fruits, pas de bière sans alcool, et pas de doublon de bière (meme nom et brasserie)
		if("fruits".equalsIgnoreCase(biere.getType())) {
			throw new BiereServiceException("Les bières de type 'fruits' ne sont pas autorisées.");
		}
		
		if(biere.getTauxAlcool() <= 0) {
			throw new BiereServiceException("Le taux d'alcool de la bière doit être supérieur à 0°.");
		}
	}

	@Override
	public List<Biere> findByNomAndBrasserie_Nom(String nom, String brasserieNom) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
