package com.study.list_;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class loopThrough {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        for (int i = 0; i < 11; i++) {
            list1.add(i);

        }
        System.out.println(list1);
        System.out.println("#########################################################");

        // enhenced for loop
        for (Object o : list1) {
            System.out.println(o);

        }
        System.out.println("#########################################################");
        // standard for
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        System.out.println("#########################################################");
        // iterator
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

    }
}
