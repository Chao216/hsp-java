package com.study.play;

import java.util.HashMap;
import java.util.Iterator;

public class hashMap1 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"Tony");
        hashMap.put(2,"Tiffant");
        hashMap.put(3,"Terry");
        hashMap.put(4,"Tobi");
        System.out.println(hashMap);

        Iterator iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        Iterator iterator1 = hashMap.keySet().iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        for (Object value : hashMap.values()) {
            System.out.println(value);
        }

        for (Object o : hashMap.keySet()) {
            System.out.println(o);
        }

    }
}
