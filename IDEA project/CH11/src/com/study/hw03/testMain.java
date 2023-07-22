package com.study.hw03;

public class testMain {
    public static void main(String[] args) {

        new Dog().shout();
        new Cat().shout();

    }
}

abstract class Animal{
    abstract  public void shout();// this is an abstract method
}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("Dogs barks like hell");

    }
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("Cat miao miao miao");
    }
}