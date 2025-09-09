package com.banking.model;

import java.util.ArrayList;
import java.util.List;


public class Account {
    private long accountNumber;
    private String customerName;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account() {
    }

    public Account(long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Getters and Setters
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

        public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}