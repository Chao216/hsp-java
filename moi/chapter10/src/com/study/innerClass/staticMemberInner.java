package com.study.innerClass;

public class staticMemberInner {
    public static void main(String[] args) {
        Apartment.fg();// fg is static method
    }
}

class Apartment{
    static String name = "Peter's house";
    static double area = 32.7;

    static class Kitchen{
        static  String name = "Peter's kitchen";
        static void speak(){
            System.out.println(name);// can only access static variables from super class
            System.out.println(Apartment.name); // if name duplicates, add super class name before variable.


        }

    }

    public static void fg(){
        new Kitchen().speak();// this is anonymous_object.function_inside
    }
}