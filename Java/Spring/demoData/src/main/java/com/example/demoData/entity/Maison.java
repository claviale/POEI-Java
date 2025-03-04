package com.example.demoData.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Caracteristique> listCar = new ArrayList<>();
	
	public Maison(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
	}
	
	//Méthode de délégation
	public void addCar(Caracteristique car) {
		listCar.add(car);
	}
	
	
}
