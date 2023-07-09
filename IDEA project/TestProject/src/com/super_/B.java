package com.super_;

public class B extends A{
    public int n5 = 500;

//    public B(int n1, int n2, int n3, int n4, int n5) {
//        super(n1, n2, n3, n4);
//        this.n5 = n5;
//    }

    public  void hi(){
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3 + " " + this.n5);
    }
}
