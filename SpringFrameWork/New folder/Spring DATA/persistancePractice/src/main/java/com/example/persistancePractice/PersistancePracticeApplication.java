package com.example.persistancePractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.persistancePractice")
public class PersistancePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistancePracticeApplication.class, args);
	}

}
