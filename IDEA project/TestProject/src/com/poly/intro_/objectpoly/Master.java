package com.poly.intro_.objectpoly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void feed(Animal animal, Food food){
        System.out.println(this.getName() + " will feed " + animal.getName() + " " + food.getName());
    }
}
