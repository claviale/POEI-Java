package com.example.demoWS.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoWS.entity.Velo;
import com.example.demoWS.service.VeloService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/velo")
public class VeloRest {
	
	@Autowired
	VeloService service;
	
	@PostConstruct
	public void init() {
		service.create(Velo.builder().marque("Peugeot").nbRoues(2).type("classique").build());
		service.create(Velo.builder().marque("Scott").nbRoues(2).type("course").build());
		service.create(Velo.builder().marque("Orbea").nbRoues(2).type("espagnol").build());
	}
	
	@GetMapping
	public ResponseEntity<List<Velo>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Velo> getById(@PathVariable("id") Integer id) {
		// TODO gérer l'id non présent
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<Velo> create(@RequestBody Velo velo) {
		// TODO gérer les exceptions
		service.create(velo);
		return ResponseEntity.ok(velo);
	}
	
	/*@PutMapping("{id}")
	public ResponseEntity<Velo> update(@RequestBody Velo velo, @PathVariable("id") Integer id) {
		Velo res = service.getById(id);
		res.setMarque(velo.getMarque());
		res.setNbRoues(velo.getNbRoues());
		res.setType(velo.getType());
		service.update(res);
		return ResponseEntity.ok(res);
	}*/
	
	@PutMapping
	public ResponseEntity<Velo> update(@RequestBody Velo velo) {
		// TODO gérer les exceptions
		service.update(velo);
		return ResponseEntity.ok(velo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Velo> delete(@PathVariable("id") Integer id) {
		// TODO gérer l'id non présent
		Velo velo = service.getById(id);
		service.delete(velo);
		return ResponseEntity.ok(velo);
	}
	
}
