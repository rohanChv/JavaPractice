package com.example.Transactions.model;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Account {

    @Id
    @SequenceGenerator(name = "seq",sequenceName = "account_sequence",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name="account_id")
    Integer accountId;

    @Column(name="user_name")
    String userName;

    @Column(name="balance")
    Double balance;
    

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
