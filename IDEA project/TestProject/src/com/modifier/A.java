package com.modifier;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void print() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
