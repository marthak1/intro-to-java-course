package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        // - constructor that accepts parameters representing the new account number,
        // starting balance and overdraft limit
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;

    }

    public double getOverdraftLimit() {
        // - returns the current overdraft limit
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        // - sets the overdraft limit
        this.overdraftLimit = overdraftLimit;

    }

}
