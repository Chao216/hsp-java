package com.study.final_;

public class hw01 {
    public static void main(String[] args) {
        circle circle = new circle(30);
        System.out.println(circle.getArea());
    }
}

class circle {
    private double radius;
    public final double PI;

    public circle(double radius) {
        this.radius = radius;
        PI = 3.14;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
