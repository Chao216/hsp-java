package com.study.enumeration;

public class enum01 {
    public static void main(String[] args) {
        Dog d1 = Dog.BIG;
        Dog d2 = Dog.BIG;
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d1.getClass());
        System.out.println(d2.getClass());
        System.out.println(d2.compareTo(d1));


    }
}

enum Dog{
    BIG,MEDIUM,SMALL;
}
