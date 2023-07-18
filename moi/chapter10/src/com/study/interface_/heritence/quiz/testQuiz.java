package com.study.interface_.heritence.quiz;

public class testQuiz {
    public static void main(String[] args) {
        System.out.println(USB.n1);// access varibales in interface
        System.out.println(cellphone.n1);// access a variable from an interface that runs in class
        cellphone cp1 = new cellphone();
        System.out.println(cp1.n1); // // all because the n1 variable is final static public
    }
}
