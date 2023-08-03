package com.study.collections.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hw01 {
    public static void main(String[] args) {

        List l1 = new ArrayList();
        l1.add (new Dog("Ellie",3));
        l1.add (new Dog("Stweie",5));
        l1.add (new Dog("Mac",1));

        Iterator iterator = l1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
        System.out.println("===========================");
        for (Object o : l1) {
            System.out.println(o);

        }


    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }
}