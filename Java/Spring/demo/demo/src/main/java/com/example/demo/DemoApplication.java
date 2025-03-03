package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.Calculatrice;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier("calculatrice1erAvril")
	public Calculatrice calculatrice;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Integer res = calculatrice.plus(3, 2);
		System.out.println(res);
		
	}
	
	

}
