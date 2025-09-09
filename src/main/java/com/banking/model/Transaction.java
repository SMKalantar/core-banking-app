package com.banking.model;

import java.util.Date;

public class Transaction {
    private TransactionType type;
    private double amount;
    private Date date;
    private long fromAccount;
    private long toAccount;

    public Transaction() {
    }


    public Transaction(TransactionType type, double amount, Date date, long fromAccount, long toAccount) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    // Getters and Setters
    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(long fromAccount) {
        this.fromAccount = fromAccount;
    }

    public long getToAccount() {
        return toAccount;
    }

    public void setToAccount(long toAccount) {
        this.toAccount = toAccount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                ", date=" + date +
                ", from=" + fromAccount +
                ", to=" + toAccount +
                '}';
    }

}
