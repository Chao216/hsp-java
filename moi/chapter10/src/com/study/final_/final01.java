package com.study.final_;

public class final01 {
    public static void main(String[] args) {
        System.out.println("regular CONSTANT can be assigned directly, in constcurtcor, in code block");
        System.out.println("static CONSTANT can be assigned directly or in static code block ONLY!");
    }
}

class Dog {
    public final int n1 = 100;
    public final int n2;
    public final int n3;

    Dog() {
        n2 = 200;
    }

    {
        n3 = 300;
    }

    ;

    public static final int n5 = 500;
    public static final int n6;

    static {
        n6 = 600;
    }

    ;
}
