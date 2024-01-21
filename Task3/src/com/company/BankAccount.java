package com.company;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public String deposit(double amount) {
        balance += amount;
        return "Deposited RS. " + amount + ". New balance: RS. " + balance;
    }

    public String withdraw(double amount) {
        if (amount > balance) {
            return "Insufficient funds";
        }
        balance -= amount;
        return "Withdrew RS. " + amount + ". New balance: RS. " + balance;
    }

    public String checkBalance() {
        return "Current balance: RS. " + balance;
    }
}
