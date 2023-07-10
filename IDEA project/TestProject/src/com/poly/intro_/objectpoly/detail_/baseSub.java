package com.poly.intro_.objectpoly.detail_;

public class baseSub {
    public static void main(String[] args) {
        Base base1 = new Sub();
        System.out.println(base1.n1);
        Sub sub1 = (Sub) base1;
        System.out.println(sub1.n1);
    }
}

class Base {
    int n1 = 10;
}

class Sub extends Base {
    int n1 = 20;
}
