package com.example.Hibernate_Final_rev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.Hibernate_Final_rev")
public class HibernateFinalRevApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateFinalRevApplication.class, args);
    }

}
