package com.example.Bierotheque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Caracteristique {
	
	@Id @GeneratedValue
	private Integer idCaracteristique;
	private String nom;
	
	
	public Caracteristique(String nom) {
		super();
		this.nom = nom;
	}
	
	
	
}
