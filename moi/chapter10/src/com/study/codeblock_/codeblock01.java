package com.study.codeblock_;

public class codeblock01 {
    public static void main(String[] args) {
        man peter = new man("Peter");
        new man("jack",23);
    }
}

class man{
    private String name;
    private int age;
    {
        System.out.println("all constructor will run codeblcoks first ");
        System.out.println("it will happen");
        System.out.println("liek always");


    };

    public man(String name) {
        this.name = name;
    }

    public man(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
