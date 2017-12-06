package com.cakeshop.cakes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.cakeshop.cakes.service"})
public class CakesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakesApplication.class, args);
	}
}
