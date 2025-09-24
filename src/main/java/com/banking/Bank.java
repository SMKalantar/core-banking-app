package com.banking;

import com.banking.model.Account;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Long, Account> accounts = new HashMap<>();

    public Map<Long, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<Long, Account> accounts) {
        this.accounts = accounts;
    }

    public Account getAccount(long accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            throw new RuntimeException("Account not found");
        }
        return accounts.get(accountNumber);
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }
}
