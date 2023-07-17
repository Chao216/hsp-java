package com.study.codeblock_;

public class codeBlockdetail03 {
    public static void main(String[] args) {
        Dog peter = new Dog("Peter");

        System.out.println("Conclusion\n\nThe sequence of priority\nstatic varibale initalization = static code block > non static varibale = non stati code block > constructor");
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        System.out.println("constructor is being called!");
        this.name = name;
    }

    public double weight = getWeight();

    {
        System.out.println("Non static code block is being called");
    }

    ;
    static public int age = getAge();

    static {
        System.out.println("Static code block is called");
    }

    ;

    public static int getAge() {
        System.out.println("static method getAge() being called");
        return 3;
    }

    public double getWeight() {
        System.out.println("non-static method getWeight() get called!");
        return 12.31;
    }
}
