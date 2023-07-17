package com.study.abstract_;

public class abstract02 {
    public static void main(String[] args) {
        E e = new E();
        e.exm();

    }
}

abstract class C{
    public abstract void exm();
}

abstract class D extends C{

}

class E extends C{
    @Override
    public void exm() {
        System.out.println("you must override the abstract method from a super class if you can not a abstract class yourself!");
    }
}