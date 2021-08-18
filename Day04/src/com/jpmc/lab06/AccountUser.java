package com.jpmc.lab06;

public class AccountUser {
    public static void main(String[] args) {
        System.out.println("=====Account====");
        Account account = new Account(10000);
        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("*****Statement******");
        account.printStatement();

        System.out.println("=====Current Account====");
        Account currentAccount = new CurrentAccount(2000000);
        //CurrentAccount currentAccount = new CurrentAccount(2000000);
        currentAccount.deposit(1000);
        currentAccount.deposit(1000);
        for(int i = 0; i < 15; i++) {
            currentAccount.withdraw(100); //Step 1
        }
        System.out.println("*****Statement******");
        currentAccount.printStatement();

        System.out.println("=====Premium Current Account====");
        Account premiumCurrentAccount = new PremiumCurrentAccount(2000000);
        premiumCurrentAccount.deposit(1000);
        premiumCurrentAccount.deposit(1000);
        for(int i = 0; i < 110; i++) {
            premiumCurrentAccount.withdraw(100);
        }
        System.out.println("*****Statement******");
        premiumCurrentAccount.printStatement();
    }
}
