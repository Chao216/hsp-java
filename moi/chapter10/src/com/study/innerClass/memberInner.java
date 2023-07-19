package com.study.innerClass;

public class memberInner {
    public static void main(String[] args) {
        new MemberOut().formula1();
    }
}

class MemberOut {
    private String name = "Peter";
    public int age = 37;

    // it is inside a class
    // but not inside method or code block anymore!
    class MemberInner {
        void speak() {
            System.out.println("name = " + name + "age=" + age);
        }
        void showAddress(){
            System.out.println(this.toString());
            System.out.println(this.getClass());
        }
    }

    public  void formula1(){
        new MemberInner().speak();
        new MemberInner().showAddress();
    }
}