package com.rohan.config;

import com.rohan.componenets.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Employee getEmployee(){
        Employee e=new Employee("Ramesh");
        return e;
    }

}
