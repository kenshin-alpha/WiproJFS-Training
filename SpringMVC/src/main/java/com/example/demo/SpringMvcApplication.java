package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringMvcApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringMvcApplication.class, args);
		
		
	}

}
