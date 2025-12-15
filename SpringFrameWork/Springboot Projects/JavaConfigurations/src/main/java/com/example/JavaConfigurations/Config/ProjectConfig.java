package com.example.JavaConfigurations.Config;

import com.example.JavaConfigurations.Service.CashPayment;
import com.example.JavaConfigurations.Service.PaymentInterface;
import com.example.JavaConfigurations.Service.PaymentService;
import com.example.JavaConfigurations.Service.UPIPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
public class ProjectConfig {
    @Autowired
    Environment env;

    @Bean
    public PaymentService getPaymentServiceBean(@Qualifier("upi") PaymentInterface payment){
        PaymentService ps=new PaymentService();
        ps.setPayment(payment);
        return ps;
    }

    @Bean(name="cash")
    public PaymentInterface getPayment1(){
        CashPayment cash=new CashPayment();
        return cash;
    }

    @Bean(name="upi")
    public PaymentInterface getPayment2(){
        UPIPayment upi=new UPIPayment();
        return upi;
    }
}
