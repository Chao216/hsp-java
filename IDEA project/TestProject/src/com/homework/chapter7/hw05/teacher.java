package com.homework.chapter7.hw05;

public class teacher extends employee{
    private int daysofteach;
    private double classfee;

    public teacher(String name, double salary, int daysofteach, double classfee) {
        super(name, salary);
        this.daysofteach = daysofteach;
        this.classfee = classfee;
    }

    public int getDaysofteach() {
        return daysofteach;
    }

    public void setDaysofteach(int daysofteach) {
        this.daysofteach = daysofteach;
    }

    public double getClassfee() {
        return classfee;
    }

    public void setClassfee(double classfee) {
        this.classfee = classfee;
    }
}
