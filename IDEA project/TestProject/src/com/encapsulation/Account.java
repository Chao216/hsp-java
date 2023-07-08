package com.encapsulation;

public class Account {
    public String name;
    private double balance;
    private String pin;

    public String getName() {
        return name;
    }

    public Account(String name, double balance, String pin) {
//        this.name = name;
//        this.balance = balance;
//        this.pin = pin;
        this.setName(name);
        this.setBalance(balance);
        this.setPin(pin);
    }

    public void setName(String name) {
        if (name.length() > 0 && name.length() < 20) {
            this.name = name;
        } else {
            System.out.println("name length between 1 and 19");
            this.name = "Sponge Bob";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 10) {
            this.balance = balance;
        } else {
            this.balance = 10;
        }

    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {

        if (pin.length() == 6) {
            this.pin = pin;
        } else {
            System.out.println("Pin must be six digits");
            this.pin = "000000";
        }

    }
}
