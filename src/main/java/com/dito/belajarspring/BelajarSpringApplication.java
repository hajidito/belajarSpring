package com.dito.belajarspring;

// import com.dito.belajarspring.rest.CobaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BelajarSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringApplication.class, args);
		SpringApplication.run(CobaService.class, args);
		// CobaService cobaService = new CobaService();
		// cobaService.HaloDunia();
		//ApplicationContext ctx = SpringApplication.run(CobaService.class, args);
	}



}
