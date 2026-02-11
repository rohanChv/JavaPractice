package com.rohan.application;

import com.rohan.config.CodeConfig;
import com.rohan.model.Person;
import com.rohan.model.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CodeConfig.class);
        Vehicle v=context.getBean(Vehicle.class);
        Person p=context.getBean(Person.class);
        System.out.println("Persons Car Injected is "+ p.getVehicle().getName());
    }
}
