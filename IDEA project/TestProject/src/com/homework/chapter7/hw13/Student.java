package com.homework.chapter7.hw13;

public class Student extends Person{
    private int stu_id;

    public Student(String name, int age, String gender, int stu_id) {
        super(name, age, gender);
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println(this.getName() + "promise that I will study hard !");
    }

    @Override
    public String play() {
        return super.play() + "football";
    }
}
