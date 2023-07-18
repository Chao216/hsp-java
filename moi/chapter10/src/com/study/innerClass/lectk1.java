package com.study.innerClass;

public class lectk1 {
    public static void main(String[] args) {
        Outter01 outter01 = new Outter01();
        outter01.m1();
    }
}

class Outter01{
    private int n1 = 10086;
    private void speak(){System.out.println("Speak() private in Ouuter01");}

    public void m1(){
        // you can create inner class in method or code block
        class Inner01{
            private int n2 = 10000;
            private void message(){System.out.println("tell me when you are home");}
            private void getN1(){System.out.println(n1);}
        }

        // you can create instance  of inner class in the method where it belongs
        Inner01 inner01 = new Inner01();
        System.out.println(inner01.n2);
        inner01.getN1();
        inner01.message();
    }
}
