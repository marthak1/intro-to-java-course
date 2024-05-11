package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interestRate;
    private double balance;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        // - constructor that accepts parameters representing the new account number,
        // starting balance and interest rate
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {

        // applies interest to the account
        /*
         * The formula for calculating simple interest is: Interest = P * R * T.
         * P = Principal amount (the beginning balance).
         * R = Interest rate (usually per year, expressed as a decimal).
         * T = Number of time periods (generally one-year time periods).
         */
        interestRate = balance * (interestRate / 100);
        balance += interestRate;
    }

    public double getInterestRate() {

        return interestRate;
        // - returns the current interest rate
    }

    public void setInterestRate(double interestRate) {
        // - sets the interest rate
        this.interestRate = interestRate;
    }

}
