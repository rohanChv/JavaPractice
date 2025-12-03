package com.rohan.config;

import com.rohan.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rohan.model")
public class ProjectConfig {
    @Bean(value="NewCar")
    public Vehicle Vehicle1(){
        Vehicle v=new Vehicle();
        v.setName("Tesla");
        return v;
    }
}
