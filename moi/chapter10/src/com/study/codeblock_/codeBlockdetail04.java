package com.study.codeblock_;

public class codeBlockdetail04 {
    public static void main(String[] args) {
        B larry = new B("Larry", 23);
    }
}

class A {
    private String  name;

    public A(String name) {
        System.out.println("code from constructor of A");
        this.name = name;
    }

    {
        System.out.println("code block from class A");

    };

}

class B extends A{
    private int age;

    public B(String name, int age) {
        super(name);
        System.out.println("Code from constructor B");
        this.age = age;
    }

    {System.out.println("code block from class B");};
}
