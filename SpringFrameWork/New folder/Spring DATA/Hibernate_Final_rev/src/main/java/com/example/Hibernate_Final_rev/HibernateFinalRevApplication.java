package com.example.Hibernate_Final_rev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.Hibernate_Final_rev")
@Profile("dev")
public class HibernateFinalRevApplication {



    public static void main(String[] args) {
        
        SpringApplication.run(HibernateFinalRevApplication.class, args);

    }

}
