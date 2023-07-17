package com.study.singleInstance;

public class lazy_mode {
    public static void main(String[] args) {
        Cat mycat = Cat.getInstance();
        System.out.println(mycat.getName());

    }
}
// always remember that single instance must use static for instance and method !!!

class Cat{
    private String name;

    // step1 privatize constructor
    // step2 declare a instance, but no initialization;
    // step3 create a public method that create a instance and return it.


    private Cat(String name) {
        this.name = name;
    }

    private static Cat cat1;

    public static Cat getInstance(){
        if (cat1 == null){
            cat1 = new Cat("blue sky");
        }
        return cat1;
    }
    public String getName(){
        return this.name;
    }

}