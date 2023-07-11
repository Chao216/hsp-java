package com.object_.intro;

public class eqEx01 {
    public static void main(String[] args) {

        Person amy = new Person("Amy", 25, 3500);
        Person amy1 = new Person("Amy", 25, 3500);
        System.out.println(amy1.equals(amy));
    }
}

class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Person) {

                Person p = (Person) obj;
                return p.name == this.name && p.age == this.age && p.salary == this.salary;

            }
        }


        return false;
    }


}