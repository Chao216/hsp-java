package com.super_;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

//    public A(int n1, int n2, int n3, int n4) {
//        this.n1 = n1;
//        this.n2 = n2;
//        this.n3 = n3;
//        this.n4 = n4;
//    }

    public void f1() {
        System.out.println("f1() method being called!");
    }

    protected void f2() {
        System.out.println("f2() method being called!");
    }

    void f3() {
        System.out.println("f3() method being called!");
    }

    private void f4() {
        System.out.println("f4() method being called!");
    }

    public void speak(){
        System.out.println("Speaking from class A");
    }
}
