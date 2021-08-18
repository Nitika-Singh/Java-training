package com.jpmc.lab06;

public class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }

    //Annotations
    @Override
    public int getWithdrawLimit() {
        return 10;
    } //6

    //Annotations
    @Override
    public void withdraw(double amount) { //2
        if(amount > 100000) {
            throw new RuntimeException("Withdraw limit exceeded");
        }
        super.withdraw(amount); //3
    }
}
