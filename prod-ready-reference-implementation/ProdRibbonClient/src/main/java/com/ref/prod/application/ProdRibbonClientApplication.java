package com.ref.prod.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
@ComponentScan("com.ref.prod.*")
public class ProdRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdRibbonClientApplication.class, args);
	}
}
