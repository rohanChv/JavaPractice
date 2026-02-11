package com.example.JPAPartOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.JPAPartOne")
public class JpaPartOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaPartOneApplication.class, args);
	}

}
