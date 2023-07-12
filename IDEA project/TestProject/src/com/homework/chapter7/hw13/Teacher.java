package com.homework.chapter7.hw13;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, int age, String gender, int work_age) {
        super(name, age, gender);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println(this.getName() + "promise that I will teach hard!");
    }

    @Override
    public String play() {
        return super.play() + "cheese";
    }
}
