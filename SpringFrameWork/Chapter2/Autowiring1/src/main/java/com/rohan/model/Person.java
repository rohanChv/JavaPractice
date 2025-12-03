package com.rohan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private Vehicle v;

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getVehicle(){
        return v.getName();
    }

    @Autowired
    public void setVehicle(Vehicle v){
        System.out.println("Setting V");
        this.v=v;
    }
}
