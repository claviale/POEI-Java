package com.example.Bierotheque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bierotheque.entity.Biere;

public interface BiereRepository extends JpaRepository<Biere, Integer> {

	List<Biere> findByNomAndBrasserie_Nom(String nom, String brasserieNom);

}
