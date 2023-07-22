package com.study.hw05;

public class test {
    public static void main(String[] args) {
        A a = new A();

    }
}

class A {

    public String NAME = "Bruce";
    {
        class B {
            public final String NAME = "Apolo";
            public void show(){
                System.out.println(NAME);
                System.out.println(A.this.NAME);
            }
        }

        B b = new B();
        b.show();
    }

    ;
}