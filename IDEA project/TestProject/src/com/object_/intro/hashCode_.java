package com.object_.intro;

public class hashCode_ {
    public static void main(String[] args) {
        example ex1 = new example();
        example ex2 = new example();
        example ex3 = ex1;
        System.out.println("ex1 hashCode= \t" + ex1.hashCode() );
        System.out.println("ex2 hashCode= \t" + ex2.hashCode() );
        System.out.println("ex3 hashCode= \t" + ex3.hashCode() );
    }



}

class example {}
