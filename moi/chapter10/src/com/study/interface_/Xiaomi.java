package com.study.interface_;

public class Xiaomi implements USB{

    @Override
    public void start() {
        System.out.println("Xiaomi starts Charging");
    }

    @Override
    public void stop() {
        System.out.println("Xioami Stops charging");
    }
}
