package com.study.list_;
import java.util.ArrayList;
import java.util.List;
public class listMetho {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("Amy");
        list1.add("May");
        list1.add("Apurva");
        System.out.println(list1);
        list1.set(0,"Emmilie"); //replace object on index 0
        System.out.println(list1);


    }
}
