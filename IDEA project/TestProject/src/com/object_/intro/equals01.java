package com.object_.intro;

public class equals01 {
    public static void main(String[] args) {
        AA aa = new AA();
        AA bb = aa;
        AA cc = bb;
        System.out.println(aa == bb);
        System.out.println(aa == cc);
        System.out.println(bb == cc);
        BB dd = new BB();
        AA ee = dd;
        System.out.println(dd == ee);


    }
}

class AA {}

class BB extends AA{}
