package com.rohan.config;

import com.rohan.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configurations {
    @Bean(value = "BMW")
    Vehicle getVehicle(){
        Vehicle v=new Vehicle();
        v.setName("BMW");
        return v;
    }
    @Bean(value="Lambo")
    @Primary
    Vehicle getVehicle1(){
        Vehicle v=new Vehicle();
        v.setName("Lamborghini");
        return v;
    }
}
