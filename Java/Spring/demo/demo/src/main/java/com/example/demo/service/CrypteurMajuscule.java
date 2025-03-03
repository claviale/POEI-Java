package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CrypteurMajuscule implements Crypteur {

	@Override
	public String crypte(String message) {
		 return message.toUpperCase();
	}

}
