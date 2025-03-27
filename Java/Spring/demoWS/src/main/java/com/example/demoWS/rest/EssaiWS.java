package com.example.demoWS.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EssaiWS {
	
	@GetMapping("/hello")
	public String hello() {
		return "coucou";
	}
	
	@GetMapping("/hello/{lang}")
	public String hello(@PathVariable("lang") String lang) {
		return "coucou en " + lang;
	}
	
	//http://localhost:8080/hello/italien/16
	@GetMapping("/hello/{lang}/{note}")
	public String hello(@PathVariable("lang") String lang, @PathVariable("note") Integer note) {
		return "coucou en " + lang + note;
	}
	
	//http://localhost:8080/hello2/italien?age=6
	@GetMapping("/hello2/{lang}")
	public String hello2(@PathVariable("lang") String lang, @RequestParam("age") Integer age) {
		return "coucou en " + lang + age;
	}
	
}
