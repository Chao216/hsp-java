package com.study.wrapper;

public class conversion {
    public static void main(String[] args) {
        //before jdk 5
        // int -> integer
        int n1 = 10;
        Integer integer1 = new Integer(n1);
        Integer integer2 = Integer.valueOf(n1);
        System.out.println(n1);
        System.out.println(integer1.getClass());
        System.out.println(integer2.getClass());
        System.out.println(n1 == integer1);
        System.out.println(integer2 == integer1);

        // integer -> int
        Integer integer3 = new Integer(3);

        int n3 = integer3.intValue();
        System.out.println(n3);

        // after jdk 5

        int num1 = 100;
        Integer integer100 = num1;

        Integer integer200 = Integer.valueOf(200);
        int num2 = integer200;

        System.out.println(integer100);
        System.out.println(num2);
    }
}
