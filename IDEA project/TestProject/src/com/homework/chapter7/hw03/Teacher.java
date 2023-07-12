package com.homework.chapter7.hw03;

public class Teacher {
    private String name;
    private int age;
    private String position;
    private double salary;

    public Teacher(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println(this.getName() + " is " + this.getAge() + " years old, his/her position is " + getPosition() + " and his/her salary is " + this.getSalary());
    }
}
