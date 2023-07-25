package com.study.String_;

public class stringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str2.equals(str1));
        System.out.println(str2.equalsIgnoreCase(str1));
        System.out.println(str2.indexOf('l'));
        System.out.println(str1.lastIndexOf('l'));
        String numbers = "0123456789";
        System.out.println(numbers.substring(3));
        System.out.println(numbers.substring(3,5));
        String moto = "Hello, Moto!";
        String[] arr = moto.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        char[] arr2 = moto.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }

        // use String format
        String name = "Chao";
        int age = 26;
        double weight = 68.3;
        char gender = 'm';
        System.out.println(String.format("%s is now %d years old, and he weights %.2f Kg, and he is %c",name,age,weight,gender));
        String temp = "%s is now %d years old, and he weights %.2f Kg, and he is %c";
        System.out.printf(temp,name, age, weight,gender);
    }
}
