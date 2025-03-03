package com.example.demoData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Maison {
	@Id @GeneratedValue
	private Integer idMaison;
	private String nom;
	private String ville;
	
	public Maison(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
	}
	
	
}
