package com.example.demoDataRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demoDataRest.entity.Personne;

// http://localhost:8080/pers
@RepositoryRestResource(collectionResourceRel = "pers", path = "pers")
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
	
	//http://localhost:8080/pers/search/findByNom?name=Terrieur
	public List<Personne> findByNom(@Param("name") String nom);
	
	@Query("FROM Personne p WHERE p.nom = :nom")
	public List<Personne> trouveParNom(@Param("nom") String nom);
}
