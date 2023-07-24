package com.study.wrapper;

import java.util.Locale;

public class IntegerString {
    public static void main(String[] args) {
        Integer itg1 = 100;
        String str1 = itg1.toString();
        String str2 = String.valueOf(itg1);
        System.out.println(str1);
        System.out.println(str2);
        String str3 = "10086";
        Integer itg2 = Integer.parseInt(str3);
        System.out.println(itg2);
        String name = "Bruce Wayne";
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.endsWith("ane"));
        Byte b1 = 1;
        Byte b2 = 10;
        System.out.println(b1.compareTo(b2));
    }
}
