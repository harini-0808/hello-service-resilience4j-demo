package com.handson.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//real world routes aren't gonna be like this tho
@RequestMapping("/service")
public class Controller {
	@Autowired
	Environment env;

	
	@GetMapping("/hello")
	public ResponseEntity<?> sayHello(){
		return ResponseEntity.status(200).body("hello service says Hello");
	}
	
	@GetMapping("/square/{number}")
	public ResponseEntity<?> square(@PathVariable int number){
		return ResponseEntity.status(200).body(number*number);
	}
	
	@GetMapping("/port")
	public String getPort() {
		return env.getProperty("server.port");
	}
}
