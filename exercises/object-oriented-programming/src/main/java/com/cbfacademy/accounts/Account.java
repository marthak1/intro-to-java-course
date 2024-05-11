package com.cbfacademy.accounts;

public class Account {
    private double balance;
    private int accountNumber;

    public Account(int accountNumber, double balance) {
        // - constructor that accepts parameters representing the new account number and
        // starting balance(current balance)
        setAccountNumber(accountNumber);
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public double getBalance() {
        // - returns the current account balance

        return balance;
    }

    public int getAccountNumber() {
        // - returns the account number

        return this.accountNumber;
    }

    public double deposit(double amount) {
        // - deposits funds to the account and returns the new balance
        this.balance = balance + amount;
        return balance;
    }

    public double withdraw(double requestedAmount) {
        // - withdraws funds from the account and returns the requested amount or return
        // 0 if
        // the account has an insufficient balance
        if (requestedAmount > 0 && balance > requestedAmount) {
            balance = requestedAmount;
            return requestedAmount;

        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        Account account = new Account(accountNumber, balance);

        String accountString = account.toString();

        assert (accountString.toString()) != null;
        assert (accountString.toString()) != null;
        return accountString;
    }

}
