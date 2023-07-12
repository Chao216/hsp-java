package com.homework.chapter7.hw10;

public class doctor {
    private String name;
    private int age;
    private String position;
    private double salary;
    private String gender;

    public doctor(String name, int age, String position, double salary, String gender) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (this == obj){
            return true;
        } else {
            if (obj instanceof doctor){
                doctor temp = (doctor) obj;
                return temp.getAge() == this.getAge() && temp.getGender() == this.getGender() && temp.getName() == this.getName() && temp.getPosition()==this.getPosition() && temp.getSalary() == this.getSalary();
            }

        }
        return false;
    }
}
