package com.example.one2one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.one2one")
public class One2oneApplication {

	public static void main(String[] args) {

		SpringApplication.run(One2oneApplication.class, args);
	}

}
