package com.banking;

import com.banking.model.Account;
import com.banking.model.Transaction;
import com.banking.model.TransactionType;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Account acc = new Account(12345L, "John Doe", 1000.0);
        Transaction tx = new Transaction(TransactionType.DEPOSIT, 500.0, new Date(),1234567890L,
                5556667777L );
        acc.addTransaction(tx);
        acc.setBalance(acc.getBalance() + 500.0);
        System.out.println(acc);
        System.out.println(acc.getTransactions());
    }
}
