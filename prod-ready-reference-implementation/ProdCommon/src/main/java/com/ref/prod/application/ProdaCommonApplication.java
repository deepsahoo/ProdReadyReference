package com.ref.prod.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ref.prod.*")
public class ProdaCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdaCommonApplication.class, args);
	}
}
