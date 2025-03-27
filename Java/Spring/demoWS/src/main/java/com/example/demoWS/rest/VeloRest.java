package com.example.demoWS.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.example.demoWS.rest.veloDto.VeloDTO;
import com.example.demoWS.service.VeloService;
import com.example.demoWS.service.VeloServiceException;

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
	public ResponseEntity<List<VeloDTO>> getAll(){
		List<VeloDTO> lst = new ArrayList<>();
		for(Velo velo : service.getAll()) {
			lst.add(new VeloDTO(velo));
		}
		return ResponseEntity.ok(lst);
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("{id}")
	public ResponseEntity getById(@PathVariable("id") Integer id) {
		Velo velo;
		try {
			velo = service.getById(id);
		} catch (VeloServiceException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("identifiant non trouvé");
		}
		return ResponseEntity.ok(new VeloDTO(velo));
	}
	
	@PostMapping
	public ResponseEntity<VeloDTO> create(@RequestBody VeloDTO veloDTO){
		// TODO gérer les exceptions
		service.create(veloDTO.toEntity());
		return ResponseEntity.ok(veloDTO);
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
	public ResponseEntity<VeloDTO> update(@RequestBody VeloDTO veloDTO){
		// TODO gérer les exceptions
		service.update(veloDTO.toEntity());
		return ResponseEntity.ok(veloDTO);
	}
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Integer id){
		Velo velo;
		try {
			velo = service.getById(id);
		} catch (VeloServiceException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		service.delete(velo);
		return ResponseEntity.ok(new VeloDTO(velo));
	}
	
}
