package com.example.JavaConfigurations.Service;

public class CashPayment implements PaymentInterface{

    @Override
    public void executePayment() {
        System.out.println("Cash Payment is Done");
    }
}
