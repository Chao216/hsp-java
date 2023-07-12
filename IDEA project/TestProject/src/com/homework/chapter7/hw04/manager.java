package com.homework.chapter7.hw04;

public class manager extends baseWorker {
    public manager(String name, double dayPay, double workdays) {
        super(name, dayPay, workdays);
    }

    @Override
    public void printSalary() {
//        super.printSalary();
        double realSalary = 1000 + super.getDayPay() * super.getWorkdays() * 1.2;
        System.out.println(super.getName() + "#" + super.getWorkdays() + "#" + realSalary);
    }
}
