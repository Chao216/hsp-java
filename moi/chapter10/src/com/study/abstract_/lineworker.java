package com.study.abstract_;

public class lineworker extends employee{
    public lineworker(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "is working hard!");
    }
}
