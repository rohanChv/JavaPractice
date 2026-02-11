package com.example.Scopes1.Application;

import com.example.Scopes1.Config.ProjectConfig;
import com.example.Scopes1.Service.PrototypeClass;
import com.example.Scopes1.Service.ServiceClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.Scopes1")
public class Scopes1Application {

	public static void main(String[] args) {

		SpringApplication.run(Scopes1Application.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		ServiceClass s1=context.getBean(ServiceClass.class);
		ServiceClass s2=context.getBean(ServiceClass.class);
		System.out.println(s1==s2);
		PrototypeClass p1=context.getBean(PrototypeClass.class);
		PrototypeClass p2=context.getBean(PrototypeClass.class);
		System.out.println(p1==p2);
	}

}
