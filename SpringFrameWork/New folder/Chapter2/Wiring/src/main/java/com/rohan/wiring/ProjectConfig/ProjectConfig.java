package com.rohan.wiring.ProjectConfig;

import com.rohan.wiring.components.Car;
import com.rohan.wiring.components.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Car getCar(){
        return  new Car("HONDA");
    }
    @Bean
    public Car getCar2(){
        return  new Car("HONDA2");
    }
    @Bean
    public Person getPerson(){
        Person p= new Person();
        p.setCar(getCar());//Basic Wiring this will call get car which will return Bean
        p.setName("Hari");
        return p;
    }
}
