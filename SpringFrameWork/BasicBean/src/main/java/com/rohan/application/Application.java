package com.rohan.application;

import com.rohan.config.Configurations;
import com.rohan.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Configurations.class);
        Vehicle v=context.getBean("BMW",Vehicle.class);
        System.out.println(v.getName());
    }
}
