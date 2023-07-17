package com.study.static_;

public class staticMetho {
    public static void main(String[] args) {
        Student ella = new Student("Ella");
        ella.pay(300);
        Student tom = new Student("tom");
        tom.pay(300);
        Student.showFee();// static method can be access with CLass.Metho

    }
}

class Student {
    private String name;
    public static double fee;

    public Student(String name) {
        this.name = name;
    }

    public static void pay(double tuition) {
        Student.fee += tuition;

    }

    public static void showFee() {
        System.out.println("we have collected " + Student.fee + "Yuan in total.");
    }
}