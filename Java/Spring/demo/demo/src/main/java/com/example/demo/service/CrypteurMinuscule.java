package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CrypteurMinuscule implements Crypteur {

	@Override
	public String crypte(String message) {
		return message.toLowerCase();
	}

}
