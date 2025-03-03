package com.example.demoData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoData.entity.Maison;

public interface MaisonRepository extends JpaRepository<Maison, Integer> {

}
