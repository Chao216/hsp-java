package com.study.static_;

public class staticOrNot {
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(B.n1);// regular varibale cannot be accessed by class.var approach.
        System.out.println(B.n2);
    }
}

class B {
    public int n1 = 3;
    public static int n2 = 6;
}
