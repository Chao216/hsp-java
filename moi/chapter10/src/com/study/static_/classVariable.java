package com.study.static_;

public class classVariable {
    public static void main(String[] args) {
        Dog ellie = new Dog("Ellie");
        ellie.count++;
        Dog peter = new Dog("Peter");
        peter.count++;
        Dog laura = new Dog("Laura");
        laura.count++;
// both instance and Class can access count variable.
        System.out.println(ellie.count);
        System.out.println(laura.count);
        System.out.println(peter.count);
        System.out.println(Dog.count);
    }
}

class Dog {
    public static int count = 0;// all instances of Dog can access, and affect this variable
    private String name;

    public Dog(String name) {
        this.name = name;
    }
}
