package com.example.demoWS.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoWS.service.Calculatrice;

@RestController
@RequestMapping("/calculatrice")
public class CalculatriceWS {
	
	@Autowired
	Calculatrice calculatrice;
	
	@GetMapping("/{a}/{op}/{b}")
	public Integer calcul(@PathVariable("a") Integer a, @PathVariable("b") Integer b, @PathVariable("op") String op) {
		return calculatrice.calcul(a, b, op);
	}
	
}
