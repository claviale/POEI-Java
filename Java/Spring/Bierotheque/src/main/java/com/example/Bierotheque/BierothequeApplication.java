package com.example.Bierotheque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Bierotheque.entity.Biere;
import com.example.Bierotheque.entity.Brasserie;
import com.example.Bierotheque.service.BiereService;
import com.example.Bierotheque.service.BiereServiceException;
import com.example.Bierotheque.service.BrasserieService;

@SpringBootApplication
public class BierothequeApplication implements CommandLineRunner {
	
	@Autowired
	BiereService biereService;
	
	@Autowired
	BrasserieService brasserieService;
	
	public static void main(String[] args) {
		SpringApplication.run(BierothequeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Brasserie brasserie1 = new Brasserie("Preums", "Nantes");
		Brasserie brasserie2 = new Brasserie("Deuz", "Paris");
		brasserieService.create(brasserie1);
		brasserieService.create(brasserie2);
		
		Biere biere1 = new Biere("Nom Bière1", "Type de bière", 16, "Un commentaire sur la bière 1", 4.4f);
		Biere biere2 = new Biere("Nom Bière2", "Type de bière", 16, "Un commentaire sur la bière 2", 3.3f);
		Biere biere3 = new Biere("Nom Bière3", "Type de bière", 16, "Un commentaire sur la bière 3", 3.7f);
		
		biere1.setBrasserie(brasserie1);
		biere2.setBrasserie(brasserie2);
		biere3.setBrasserie(brasserie1);
		
		biereService.create(biere1);
		biereService.create(biere2);
		biereService.create(biere3);
		
		System.out.println();
		List<Biere> liste = biereService.getAll();
		liste.forEach(System.out::println);
		
		biere1.setCommentaire("Commentaire modifié de la bière 1");
		biereService.update(biere1);
		
		System.out.println();
		biereService.getAll().forEach(System.out::println);
		
		biereService.delete(biere2);
		
		System.out.println();
		biereService.getAll().forEach(System.out::println);
		
		// Affiche un message d'erreur "Bière non trouvée pour suppression"
		//service.delete(biere2);
		
		//System.out.println();
		//service.getAll().forEach(System.out::println);
		
		//test des contraintes

		try {
			Biere biere4 = new Biere("Nom Bière4", "Type de bière", 16, "Un commentaire sur la bière 4", 0f);
			biere4.setBrasserie(brasserie1);
			biereService.create(biere4);
		} catch (BiereServiceException e) {
			System.err.println("ERREUR : " + e.getMessage());
		}
		
		try {
			Biere biere5 = new Biere("Nom Bière5", "fruits", 16, "Un commentaire sur la bière 4", 4.2f);
			biere5.setBrasserie(brasserie2);
			biereService.create(biere5);
		} catch (BiereServiceException e) {
			System.err.println("ERREUR : " + e.getMessage());
		}
		
		try {
			Biere biere6 = new Biere("Nom Bière1", "Type de bière", 16, "Un commentaire sur la bière 4", 3.3f);
			biere6.setBrasserie(brasserie1);
			biereService.create(biere6);
		} catch (BiereServiceException e) {
			System.err.println("ERREUR : " + e.getMessage());
		}
			
	}

}
