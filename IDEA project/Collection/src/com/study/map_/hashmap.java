package com.study.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Peter",173);
        map.put("Peter",163);
        map.put("Superman",193);
        map.put("Bruce",183);
        map.put("Obama",179);
        map.put("Trump",193);
        map.put("eddie",null);
        map.put(null,0);
        System.out.println(map);

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
        System.out.println("********************************************");
        for (Object o : map.keySet()) {
            System.out.println(o);
        }
        System.out.println("*****************************************");
        Iterator iterator1 = map.values().iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        System.out.println("******************************************");
        for (Object value : map.values()) {
            System.out.println(value);
        }
        System.out.println("*************************************");
        Iterator iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(next);
        }
        System.out.println("*********************************************");
        for (Object o : map.entrySet()) {
            System.out.println(o);
        }
    }
}
