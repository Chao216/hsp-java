package com.encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        Account chao = new Account("Chao", 21, "123456");
        System.out.println(chao.name+chao.getBalance()+chao.getPin());
    }
}
