package com.study.abstract_.templates;

public class extend1 extends template{
    @Override
    public void task() {
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;

        }
    }
}
