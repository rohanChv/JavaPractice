package com.example.Transactions.DTO;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
    Integer debitAccount;
    Integer creditAccount;
    Double debitAmount;

    public Integer getDebitAccount() {
        return debitAccount;
    }

    public Integer getCreditAccount() {
        return creditAccount;
    }

    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAccount(Integer debitAccount) {
        this.debitAccount = debitAccount;
    }

    public void setCreditAccount(Integer creditAccount) {
        this.creditAccount = creditAccount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }
}
