package com.example.JavaConfigurations.Application;

import com.example.JavaConfigurations.Config.ProjectConfig;
import com.example.JavaConfigurations.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.JavaConfigurations")
public class Scopes1Application {


	public static void main(String[] args) {
		SpringApplication.run(Scopes1Application.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);

		PaymentService ps=context.getBean(PaymentService.class);
		ps.executePayment();

	}

}
