package com.rohan.wiring.application;

import com.rohan.wiring.ProjectConfig.ProjectConfig;
import com.rohan.wiring.components.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p=context.getBean(Person.class);
        System.out.println(p.getCar().getName());
        System.out.println(p.getName());
    }
}
