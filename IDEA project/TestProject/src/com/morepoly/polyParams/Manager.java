package com.morepoly.polyParams;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manage(){
        System.out.println(this.getName() + " is managing the production now !");
    }
}
