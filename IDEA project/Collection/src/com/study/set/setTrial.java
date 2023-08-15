package com.study.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setTrial {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");
        set1.add("Six");
        set1.add("Seven");
        set1.add("Eight");
        set1.add("Nine");

        System.out.println(set1);
        System.out.println("=====================iterator=================");

        Iterator iterator = set1.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=========================enhenced for loop===================");
        for (Object o : set1) {
            System.out.println(o);

        }
    }
}
