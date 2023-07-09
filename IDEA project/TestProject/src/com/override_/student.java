package com.override_;

public class student extends man{
    private int id;

    public student(String name, int age, int id) {
        super(name, age);// auto done
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //override means child class has a same method as father super class
    public String getInfo(){
        return super.getInfo() + " id = " + id;
    }
}
