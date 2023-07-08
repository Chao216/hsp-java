package com.encapsulation;

public class encap01 {
    public static void main(String[] args) {

        Person person1 = new Person("Tobiiiiiiiiiiiiiii", 130, 2399, "Assistant");
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getSalary());
        System.out.println(person1.getPosition());

    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    private String position;

    public Person(String name, int age, double salary, String position) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.position = position;
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setPosition(position);
        // then you can validate arguments in the constructor !
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 10 && name.length() > 1) {
            this.name = name;
        } else {
            System.out.println("name length 1-10, a default name amy is given instead");
            this.name = "Amy";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("age not valid");
            this.age =18;
        }
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}