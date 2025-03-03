package com.example.demoData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demoData.entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
	
	// Deux façons d'écrire la même chose
	
	List<Personne> findByAge(Integer age);

	@Query("FROM Personne p WHERE p.age = :age")
	List<Personne> findByAge2(@Param("age") Integer age);
	
	
	// @Modifying : a ajouter si autre chose que le select

}
