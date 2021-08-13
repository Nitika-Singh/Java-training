package com.jpmc.lab04;

public class AccountUser {
    public static void main(String[] args) {
        Account account = new Account(10000);
        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(1000000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("*****Statement******");
        account.printStatement();
        //Account account2 = new Account(100);
    }
}
