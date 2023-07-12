package com.homework.chapter7.hw04;

public class baseWorker {

    private String name;
    private double dayPay;
    private double workdays;

    public baseWorker(String name, double dayPay, double workdays) {
        this.name = name;
        this.dayPay = dayPay;
        this.workdays = workdays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDayPay() {
        return dayPay;
    }

    public void setDayPay(double dayPay) {
        this.dayPay = dayPay;
    }

    public double getWorkdays() {
        return workdays;
    }

    public void setWorkdays(double workdays) {
        this.workdays = workdays;
    }

    public void printSalary() {
        double realSalary = this.getWorkdays() * this.dayPay;
        System.out.println(this.getName() + " worked for " + this.getWorkdays() + " and you salary is " + realSalary);
    }
}
