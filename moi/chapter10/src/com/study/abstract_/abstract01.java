package com.study.abstract_;

public class abstract01 {
    public static void main(String[] args) {
        System.out.println("public method must be placed in abstract class");
        System.out.println("public method is not compulsory in a abstract class");
        System.out.println("you cannot create instance from a abstract class");
        System.out.println("abstract keyword only on class and method");
    }
}

abstract class AA {
    public abstract void speak();
}

abstract class BB {
    public void read() {
    }
}
