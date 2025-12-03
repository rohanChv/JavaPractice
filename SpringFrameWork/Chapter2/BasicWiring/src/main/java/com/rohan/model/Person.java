package com.rohan.model;

public class Person {
    String name;
    Vehicle vehicle;
    public Person(Vehicle v){
        this.vehicle=v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
