package com.jpmc.lab06;

public class PremiumCurrentAccount extends Account {
    public PremiumCurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public int getWithdrawLimit() {
        return 100;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 1000000) {
            throw new RuntimeException("Withdraw limit exceeded");
        }
        super.withdraw(amount);
    }
}
