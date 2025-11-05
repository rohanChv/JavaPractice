package com.rohan.vehicle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello From Instance");
    }
    @PostConstruct
    public void initialize(){
        setName("Honda");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY");
    }
}
