package com.study.enumeration;

public class manual {
    public static void main(String[] args) {
        Season sp = Season.SPRING;
        System.out.println(sp.getDescription());
        Season sm = Season.SUMMER;
        System.out.println(sm.getDescription());

    }
}

class Season{
    private String name;
    private String description;

    // to manually do so,
    // step1 privatize constructor
    // create instance inside.

    public static final Season SPRING = new Season("Spring","Warm");
    public static final Season SUMMER = new Season("Summer","Hot");
    public static final Season FALL = new Season("Fall","Cool");
    public static final Season WINTER = new Season("Winter","Warm");

    private Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
