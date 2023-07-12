package com.homework.chapter7.hw08;

public class test {
    public static void main(String[] args) {
        checkingAccount acc1 = new checkingAccount(1000);
        System.out.println(acc1.getBalance());
        acc1.deposit(100);
        System.out.println(acc1.getBalance());
        acc1.withdraw(100);
        System.out.println(acc1.getBalance());

    }
}
