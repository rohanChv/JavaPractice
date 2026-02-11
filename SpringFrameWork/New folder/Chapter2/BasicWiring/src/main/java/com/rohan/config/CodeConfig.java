package com.rohan.config;

import com.rohan.model.Person;
import com.rohan.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CodeConfig {
    @Bean
    public Vehicle getVehicle(){
        Vehicle v=new Vehicle();
        v.setName("AUDI");
        return v;
    }
    @Bean
    @Primary
    public Vehicle getDefaultVehicle(){
        Vehicle v=new Vehicle();
        v.setName("LAMBORGHINI");
        return v;
    }
    @Bean
    public Person getPerson(Vehicle v){
        return new Person(v);
    }
}
