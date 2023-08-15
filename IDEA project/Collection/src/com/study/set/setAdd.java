package com.study.set;

import java.util.HashSet;
import java.util.Set;

public class setAdd {
    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(2));
        System.out.println(set.add(3));
        System.out.println(set.add(4));
        System.out.println(set.add(5));
        System.out.println(set.add(6));
        System.out.println(set.add(6));
        System.out.println(set);
        System.out.println(set.remove(1));
        System.out.println(set);
    }
}
