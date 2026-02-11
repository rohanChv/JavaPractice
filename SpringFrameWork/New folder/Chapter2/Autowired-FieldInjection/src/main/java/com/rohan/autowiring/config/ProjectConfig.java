package com.rohan.autowiring.config;

import com.rohan.autowiring.components.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rohan.autowiring")
public class ProjectConfig {

}
