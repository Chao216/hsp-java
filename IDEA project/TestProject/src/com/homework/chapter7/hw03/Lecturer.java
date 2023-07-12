package com.homework.chapter7.hw03;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age, String position, double salary) {
        super(name, age, position, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.1;
    }

    @Override
    public void introduce() {
//        super.introduce();
        System.out.println("name = " + super.getName() + " age= " + super.getAge() + " position = " + super.getPosition() + " income = "+ this.getSalary());
    }
}
