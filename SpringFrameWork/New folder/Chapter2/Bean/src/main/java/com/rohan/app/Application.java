package com.rohan.app;

import com.rohan.componenets.Employee;
import com.rohan.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Employee e=context.getBean(Employee.class);
        System.out.println(e.getName());
    }
}
