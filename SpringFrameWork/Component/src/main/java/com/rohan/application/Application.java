package com.rohan.application;

import com.rohan.config.ProjectConfig;
import com.rohan.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
        vehicle.sayHello();
        ConfigurableApplicationContext context1 = (ConfigurableApplicationContext) context;
        context1.close();
    }

}
