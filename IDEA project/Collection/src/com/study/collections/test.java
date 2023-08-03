package com.study.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("Hello");
        list1.add(39);
        list1.add(true);
        list1.add(32.121);
        list1.add('H');
        System.out.println(list1);
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        list1.remove("Hello");
        System.out.println(list1);
        List list2 = new ArrayList();
        list2.add(true);
        list2.add('H');

        // to add more, use addAll
        list1.addAll(list2);
        System.out.println(list1);
        // to remove more, use removeAll

        list1.removeAll(list2);
        System.out.println(list1);
        list1.clear();// will empty the list
        System.out.println(list1);
    }
}
