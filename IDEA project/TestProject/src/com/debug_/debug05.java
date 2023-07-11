package com.debug_;

public class debug05 {
    public static void main(String[] args) {
        Person tobi = new Person("Tobi", 29, 4783);
        System.out.println(tobi);
    }
}
class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
