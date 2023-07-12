package com.homework.chapter7.hw10;

public class testDoc {
    public static void main(String[] args) {
        doctor doctor1 = new doctor("peter", 29, "gp", 2500, "male");
        doctor doctor2 = new doctor("peter", 29, "gp", 2500, "male");
        System.out.println(doctor2.equals(doctor1));
        System.out.println(doctor2 == doctor1);
    }
}
