package com.study.codeblock_;

public class staticCodeblock {
    public static void main(String[] args) {
        System.out.println(Cat.age);// static code block will be executed
        System.out.println("==============================");
        Cat cat = new Cat();// non-static code block will run

    }
}

class Cat{
    public static int age = 1;

    static {
        System.out.println("a code from static code block");
    };
    {
        System.out.println("a code from non-static code block");
    };
}