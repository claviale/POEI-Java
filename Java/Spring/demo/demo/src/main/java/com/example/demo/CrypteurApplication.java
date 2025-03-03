package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.Crypteur;


@SpringBootApplication
public class CrypteurApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier("crypteurMajuscule")
	public Crypteur crypteur;
	
	public static void main(String[] args) {
		SpringApplication.run(CrypteurApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String res = crypteur.crypte("Bonjour !");
		System.out.println(res);
	}

}
