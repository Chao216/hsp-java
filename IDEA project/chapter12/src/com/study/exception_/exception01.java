package com.study.exception_;

public class exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            int res = n1/n2;
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.hashCode());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

        } finally {
            System.out.println("this is from finally");
        }
        System.out.println("after the try catch");
    }
}
