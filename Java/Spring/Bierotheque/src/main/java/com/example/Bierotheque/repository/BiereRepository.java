package com.example.Bierotheque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Bierotheque.entity.Biere;
import com.example.Bierotheque.entity.Brasserie;

public interface BiereRepository extends JpaRepository<Biere, Integer> {

	List<Biere> findByNomAndBrasserie_Nom(String nom, String brasserieNom);
	
	@Query("SELECT b.brasserie FROM Biere b JOIN b.listeCar c WHERE c.nom = :nom")
	List<Brasserie> findAllBrasserieOfCar(@Param("nom") String carac);

}
