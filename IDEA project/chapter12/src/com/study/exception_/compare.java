package com.study.exception_;

public class compare {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;
        try {
            double res = n1/n2;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getCause());


        }finally {
            System.out.println("printed by finally");
        }
        System.out.println("another print ");

    }
}


