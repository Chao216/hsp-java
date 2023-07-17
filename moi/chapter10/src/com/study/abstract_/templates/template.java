package com.study.abstract_.templates;

public abstract class template {
    public abstract void task(); // this is an abstract method

    public void timing(){
        long start = System.currentTimeMillis();
        task();
        long end = System.currentTimeMillis();

        System.out.println("Task used " + (end - start) +"ms in total");
    }
}
