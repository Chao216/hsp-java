package com.object_.intro;

public class equals01 {
    public static void main(String[] args) {
        AA aa = new AA();
        AA bb = aa;
        AA cc = bb;
        System.out.println(aa == bb);
        System.out.println(aa == cc);
        System.out.println(bb == cc);
        BB dd = new BB();
        AA ee = dd;
        System.out.println(dd == ee);

        // equals method
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str2.equals(str1));
        Integer integer = new Integer(10000);
        Integer integer1 = new Integer(10000);
        System.out.println(integer1 == integer);
        System.out.println(integer1.equals(integer));
        String hello = new String("Hello");
        String hello1 = new String("Hello");
        System.out.println(hello1==hello);
        System.out.println(hello1.equals(hello));


    }
}

class AA {}

class BB extends AA{}
