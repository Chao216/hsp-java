package com.study.innerClass;

public class lectk1 {
    public static void main(String[] args) {
        Outter01 outter01 = new Outter01();
        outter01.m1();
    }
}

class Outter01 {
    private int n1 = 10086;
    private String name = "Peter griffin";

    private void speak() {
        System.out.println("Speak() private in Ouuter01");
    }

    public void m1() {
        // you can create inner class in method or code block
        class Inner01 {
            private int n2 = 10000;
            private String name = "Leonid Chechurin";

            private void message() {
                System.out.println("tell me when you are home");
            }

            private void getN1() {
                System.out.println(n1);
            }
            private void printNames(){
                System.out.println(this.name);
                System.out.println(Outter01.this.name);// to access outer properties
            }
        }

        // you can create instance  of inner class in the method where it belongs
        Inner01 inner01 = new Inner01();
        System.out.println(inner01.n2);
        inner01.getN1();
        inner01.message();
        inner01.printNames();
    }
}
