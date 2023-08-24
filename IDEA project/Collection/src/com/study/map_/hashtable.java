package com.study.map_;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class hashtable {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("1","Amy");
        hashtable.put("2","IKEA");
        hashtable.put("3","Deluxe");
        hashtable.put("4","SONY");
        hashtable.put("5","Apple");
        hashtable.put("6","Johnny");
        System.out.println(hashtable);

        Iterator iterator = hashtable.keySet().iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println();
        System.out.println();
        for (Object o : hashtable.keySet()) {
            System.out.println(o);
        }
        System.out.println("***********************************8");
        Iterator iterator1 = hashtable.values().iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        System.out.println();
        System.out.println();
        for (Object value : hashtable.values()) {
            System.out.println(value);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++=");
        Iterator iterator2 = hashtable.entrySet().iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(next);
        }
        System.out.println();
        System.out.println();
        for (Object o : hashtable.entrySet()) {
            System.out.println(o);
        }
    }
}
