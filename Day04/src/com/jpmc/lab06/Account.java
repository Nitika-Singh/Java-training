package com.jpmc.lab06;

import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private double balance;
    private int withdrawCount;
    private ArrayList<Transaction> transactions;
    private final String DEBIT = "Debit";
    private final String CREDIT = "Credit";
    private final String FEE = "Fee (Debit)";

    public Account(double balance) {
        if(balance < 10000) {
            throw new RuntimeException("Minimum balance should be 10000");
        }
        this.accountNumber = (int)(Math.random() * 100000);
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public int getWithdrawLimit() {
        return 3;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        recordTransaction(amount, CREDIT);
    }

    private void recordTransaction(double amount, String type) {
        Transaction txn = new Transaction(accountNumber, amount, type);
        transactions.add(txn);
    }

    public void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            withdrawCount++;
            if (withdrawCount > getWithdrawLimit()) {
                double fee = amount * 0.005;
                if(balance < fee) {
                    System.out.println("Insufficient balance");
                    withdrawCount--;
                } else {
                    balance -= amount;
                    balance -= fee;
                    recordTransaction(amount, DEBIT);
                    recordTransaction(fee, FEE);
                }
            } else {
                balance -= amount;
                recordTransaction(amount, DEBIT);
            }
        }
    }
    public void printStatement() {
        //If you want to modify the collection use for-loop
        for(int i = 0; i < transactions.size(); i++) {
            Transaction txn = transactions.get(i);
            System.out.println(txn.getAccountNumber() +
                    " -> " +
                    "Rs." + txn.getAmount() +
                    " (" + txn.getTransactionType() + ")" +
                    " on " + txn.getTime());
        }

        //If your objective is to just READ the collection
        //you can use foreach loop
        for(Transaction txn : transactions) {
            System.out.println(txn.getAccountNumber() +
                    " -> " +
                    "Rs." + txn.getAmount() +
                    " (" + txn.getTransactionType() + ")" +
                    " on " + txn.getTime());
        }
    }

}
