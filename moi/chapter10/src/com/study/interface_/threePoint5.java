package com.study.interface_;

public interface threePoint5 {
    double diameter = 3.5;

    void connect();

    default void alert() {
        System.out.println("3.5mm headphone is connected!");

    }

    static void message(){
        System.out.println("Chao, you will live in EU soon !");
    }
}
