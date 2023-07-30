package com.study.Arrays;

public class Anonymousreview {
    public static void main(String[] args) {
        // anonymous class implements Mouse Interface
        Mouse m1 = new Mouse() {
            @Override
            public void click() {
                System.out.println("mouse being clicked !");
            }
        };

        m1.click();
        System.out.println(m1.getClass());

        Person p1 = new Person("Teddy") {
            @Override
            void speak() {
                System.out.println("Hello folks");
            }
        };

        p1.speak();
        System.out.println(p1.getClass());

    }
}

interface Mouse{

    void click();

}

abstract class Person{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void speak();
}
