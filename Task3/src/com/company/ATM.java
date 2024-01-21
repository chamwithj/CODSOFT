package com.company;

public class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String withdraw(double amount) {
        return userAccount.withdraw(amount);
    }

    public String deposit(double amount) {
        return userAccount.deposit(amount);
    }

    public String checkBalance() {
        return userAccount.checkBalance();
    }
}
