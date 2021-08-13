package com.jpmc.lab04;

import java.time.LocalDateTime;

public class Transaction {
    private int accountNumber;
    private double amount;
    private String transactionType;
    private LocalDateTime time;

    public Transaction(int accountNumber, double amount, String transactionType) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.time = LocalDateTime.now();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
