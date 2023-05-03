package com.springmeal.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringMealBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMealBackApplication.class, args);
	}

}
