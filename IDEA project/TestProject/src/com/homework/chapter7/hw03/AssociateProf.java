package com.homework.chapter7.hw03;

public class AssociateProf extends Teacher{
    public AssociateProf(String name, int age, String position, double salary) {
        super(name, age, position, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.2;
    }

    @Override
    public void introduce() {
//        super.introduce();
        System.out.println("name = " + super.getName() + " age= " + super.getAge() + " position = " + super.getPosition() + " income = "+ this.getSalary());
    }
}
