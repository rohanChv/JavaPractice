package com.bank.transactions;

import com.bank.exceptions.LowBalance;

public class Transactions {
    public static void checkBalance(double amount) throws LowBalance{
        if(amount<10000.00)
            throw new LowBalance();
        else
            System.out.println("good $"+amount);
    }

    public static void main(String[] args) {
        try{
            checkBalance(100000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
