package com.study.annotation;

public class deprecated {
    public static void main(String[] args) {
//        Man.speak();
        Man man = new Man();
        man.speak();
        System.out.println("Actually Deprecated just indicate that something is not recommended, outdated!,but you may still use it ");
    }
}
@Deprecated
class Man{
    @Deprecated
    public static String name = "Peter";
    @Deprecated
    public static int age = 13;
    @Deprecated
    public static void speak(){System.out.println("Hello Deprecated !");}
}
