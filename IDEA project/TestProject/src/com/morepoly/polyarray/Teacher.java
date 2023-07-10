package com.morepoly.polyarray;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say(){
        return super.say() + " and his salary is " + this.salary;
    }

    public  String teach(){
        return super.say() + "is now teaching";
    }
}
