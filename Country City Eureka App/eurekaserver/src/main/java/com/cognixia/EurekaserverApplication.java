package com.cognixia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {

	public static void main(String[] args) {
		/*
		 * Instructions on usage:
		 * Run this application first to start server
		 * Check localhost:8761 to make sure eureka is started
		 * Then run CountryClient and CityClient
		 */
		SpringApplication.run(EurekaserverApplication.class, args);
	}

}
