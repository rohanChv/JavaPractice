package com.example.JavaConfigurations.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class PaymentService {
    PaymentInterface payment;
    

    public PaymentInterface getPayment() {
        return payment;
    }

    public void executePayment() {
        payment.executePayment();
        Environment env = ;
        System.out.println("URL->"+env.getProperty("application.url"));
    }

    public void setPayment(PaymentInterface payment) {
        this.payment = payment;
    }
}
