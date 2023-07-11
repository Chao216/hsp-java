package com.morepoly.polyParams;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(this.getName() + " is working hard in the workshop now !");
    }
}
