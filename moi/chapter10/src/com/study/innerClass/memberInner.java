package com.study.innerClass;

public class memberInner {
    public static void main(String[] args) {
        new MemberOut().formula1();
        //how to create a inner class bedroom instance?
        House house = new House();
        House.Bedroom bd = house.new Bedroom();
        System.out.println(bd.name);
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

class House{
    class Bedroom{
        String name = "This is a room for Stewie!";
    }
}