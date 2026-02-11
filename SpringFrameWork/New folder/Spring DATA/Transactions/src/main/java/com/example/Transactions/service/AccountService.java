package com.example.Transactions.service;

import com.example.Transactions.DTO.Transaction;
import com.example.Transactions.model.Account;
import com.example.Transactions.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Transactional
    public void performTransaction(Transaction transaction) throws InterruptedException {
            Account receiverAccount= accountRepo.findByAccountId(transaction.getCreditAccount());
            Account senderAccount= accountRepo.findByAccountId(transaction.getDebitAccount());

            Double debitAmount= transaction.getDebitAmount();
            Double senderAccountNewBalance= senderAccount.getBalance()- transaction.getDebitAmount();
            Double receiverAccountNewBalance= receiverAccount.getBalance()+debitAmount;

            accountRepo.updateDebitAccount(senderAccountNewBalance,senderAccount.getAccountId());
            System.out.println("SLEEEPING");
            Thread.sleep(5000);
            String s=accountRepo.updateCreditAccount(receiverAccountNewBalance,receiverAccount.getAccountId());
            if(s.isEmpty()){
                throw  new RuntimeException("UPDATE NOT DONE ");
            }
    }

}
