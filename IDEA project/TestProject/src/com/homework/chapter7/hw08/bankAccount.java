package com.homework.chapter7.hw08;

public class bankAccount {
    private double balance;

    public bankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("deposited" + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("withdrawed " + amount);
        balance -= amount;
    }
}
