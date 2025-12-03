package com.rohan.autowiring.application;

import com.rohan.autowiring.components.Person;
import com.rohan.autowiring.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person=context.getBean(Person.class);
        person.setName("Hellow");
        System.out.println(person.getCar().getName());
        System.out.println(person.getName());
        String s="StressFul".toLowerCase();
        List<Character> list = new ArrayList<>();
        char[] c= s.toCharArray();
        for(char c1:c){
            list.add(c1);
        }
        Map<Character,Long> cmap=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        cmap.entrySet().forEach(e->{
            System.out.println(e.getKey() +" = "+e.getValue());
        });
        list.stream().distinct().forEach(System.out::println);
        
    }
}
