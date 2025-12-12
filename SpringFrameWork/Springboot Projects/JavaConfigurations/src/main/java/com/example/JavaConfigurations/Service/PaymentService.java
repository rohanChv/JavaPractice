package com.example.JavaConfigurations.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class PaymentService {
    PaymentInterface payment;
    @Autowired
    private final Environment env;

    @Value("${url}")
    String s;

    public PaymentService(Environment env) {
        this.env = env;
    }


    public PaymentInterface getPayment() {
        return payment;
    }

    public void executePayment() {
        payment.executePayment();

        System.out.println("URL->"+s);
    }

    public void setPayment(PaymentInterface payment) {
        this.payment = payment;
    }
}
