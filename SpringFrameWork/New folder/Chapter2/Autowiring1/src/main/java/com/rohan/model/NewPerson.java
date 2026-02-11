package com.rohan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewPerson {
    Vehicle veh;
    @Autowired
    public NewPerson(@Qualifier("NewCar")Vehicle veh){
        this.veh=veh;
    }
    public String getName(){
        return veh.getName();
    }
}
