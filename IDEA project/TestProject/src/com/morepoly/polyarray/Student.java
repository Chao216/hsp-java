package com.morepoly.polyarray;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say() + " and his score is " + this.score;
    }

    public String study(){
        return super.say() + " is now studying";
    }
}
