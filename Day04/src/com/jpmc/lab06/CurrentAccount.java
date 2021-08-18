package com.jpmc.lab06;

public class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public int getWithdrawLimit() {
        return 10;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 100000) {
            throw new RuntimeException("Withdraw limit exceeded");
        }
        super.withdraw(amount);
    }
}
