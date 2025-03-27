package fr.m2i.docker_with_database.controller;

import fr.m2i.docker_with_database.entity.Patisserie;
import fr.m2i.docker_with_database.service.PatisserieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatisserieController {

    @Autowired
    PatisserieService patisserieService;

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Up and running !");
    }

    @GetMapping
    public ResponseEntity<List<Patisserie>> findAll() {
        return ResponseEntity.ok(patisserieService.getPatisseries());
    }
    @PostMapping
    public void save(@RequestBody Patisserie patisserie) {
        patisserieService.save(patisserie);
    }
}
