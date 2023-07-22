package com.study.hw04;

public class testMain {
    public static void main(String[] args) {
        CAL cellphone = new CAL() {
            @Override
            public void work() {
                System.out.println("Calculator method is being used by " + this.getClass());
            }
        };
        cellphone.work();

    }
}

interface CAL{
    void work();
}
