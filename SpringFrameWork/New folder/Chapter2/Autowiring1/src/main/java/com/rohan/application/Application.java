package com.rohan.application;

import com.rohan.config.ProjectConfig;
import com.rohan.model.NewPerson;
import com.rohan.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p=context.getBean(Person.class);
        NewPerson np=context.getBean(NewPerson.class);
        System.out.println("PERSON ->"+p.getVehicle());
        System.out.println(np.getName());
    }
}
