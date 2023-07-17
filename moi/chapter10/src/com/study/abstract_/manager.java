package com.study.abstract_;

public class manager extends employee{
    public manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "is managing hard !");
    }
}
