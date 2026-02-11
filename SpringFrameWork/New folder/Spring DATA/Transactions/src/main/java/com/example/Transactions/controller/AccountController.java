package com.example.Transactions.controller;

import com.example.Transactions.DTO.Transaction;
import com.example.Transactions.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountService service;

    @PostMapping("/addTransaction")
    public void performTransaction(@RequestBody Transaction transaction) throws InterruptedException {
        service.performTransaction(transaction);
    }
}
