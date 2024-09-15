package com.handson.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}
	

}
