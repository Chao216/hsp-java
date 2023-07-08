package com.extends_;

public class Extends01 {
    public static void main(String[] args) {

        Student stu1 = new Student();
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.gender);
        System.out.println(stu1.planet);
        System.out.println(stu1.Uni);
        System.out.println(stu1.Program);
        System.out.println(stu1.getBlood());

    }
}

class Animal {
    String planet = "Earth";
    int age = 13;
    private int blood = 50000;

    public int getBlood() {
        return blood;
    }
}

class Person extends Animal {
    String gender = "male";
    String name = "Chao";
}

class Student extends Person {
    String Uni = "Lappeenranta Lahti University of Technology";
    String Program = "GMIT";
}