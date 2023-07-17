package com.study.interface_;

public class iphone implements USB, HDMI{
    @Override
    public void start() {
        System.out.println("iphone charging begin");
    }

    @Override
    public void stop() {
        System.out.println("iphone charging ends");
    }

    @Override
    public void output() {
        System.out.println("iphone is using HDMI port!");
    }
}
