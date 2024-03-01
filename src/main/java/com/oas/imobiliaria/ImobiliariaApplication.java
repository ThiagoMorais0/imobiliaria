package com.oas.imobiliaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.oas.imobiliaria.model")
public class ImobiliariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImobiliariaApplication.class, args);
	}

}
