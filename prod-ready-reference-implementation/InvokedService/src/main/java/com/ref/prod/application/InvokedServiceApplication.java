package com.ref.prod.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ref.prod.*")
@EnableEurekaClient
public class InvokedServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvokedServiceApplication.class, args);
	}
}
