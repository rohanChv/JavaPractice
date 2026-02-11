package com.example.JavaConfigurations.Service;

public class UPIPayment implements PaymentInterface{

    @Override
    public void executePayment() {
        System.out.println("Initiated UPI Payment");
    }
}
