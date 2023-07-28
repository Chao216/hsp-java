package com.study.String_;

public class forLoopRew {
    public static void main(String[] args) {
        for (int i = 100; i > -100; i -= 5) {
            System.out.println("i = " + i);
        }

        for (double d = 1; d < 100; d = d * 1.00001) {
            System.out.println(d);
        }

        for (double d1 = 2; d1 < 1008600000; d1 = Math.pow(d1, 2)) {
            double ram = d1/1024;
            System.out.println("RAM = " + ram+" GB");
        }



    }
}
