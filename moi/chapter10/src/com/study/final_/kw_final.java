package com.study.final_;

public class kw_final {
    public static void main(String[] args) {
        C c = new C();
//        c.n1 = 100;

    }
}

final class A {
    // class A will no longer be allowed to be extended
}

class B {
    final public void speak() {// this method no override option
        System.out.println("don't ever thinking about overriding me !");
    }
}

class C {
    public final int n1 = 10086; // no modification of n1

}

class D {
    public int add5(int anotherInt){
        final int base = 5;
//        base =10;
        return anotherInt + base;
    }
}