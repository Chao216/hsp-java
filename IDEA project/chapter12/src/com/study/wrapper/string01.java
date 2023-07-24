package com.study.wrapper;

public class string01 {
    public static void main(String[] args) {
        String a = "hello";
        String b = " ";
        String c = "world";
        String d = a + b + c;
        String e = "hello world";
        String f = d.intern();
        System.out.println(d==e);// d points to a address in heap
        System.out.println(f==e);// f is the addrss in pool where stores "hello world"
        System.out.println(f==d);
        System.out.println(f.intern()==d.intern());
        System.out.println(d.equals(e));

    }
}
