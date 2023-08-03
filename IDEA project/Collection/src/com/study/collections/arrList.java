package com.study.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class arrList {
    public static void main(String[] args) {

        Collection col = new ArrayList();// 向上转型
        col.add(new Phone("Redmi","K60",2299));
        col.add(new Phone("Xiaomi","13Pro",5299));
        col.add(new Phone("Apple","iPhone 11",3599));
        col.add(new Phone("Samsung","S23",6299));

        Iterator iterator = col.iterator();

        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("object is " + obj);

        }

        // if you want to iterate elements again
        // you need to reset the iterator
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (Object element: col){
            System.out.println(element);
        }
        System.out.println();
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        for (int ele:arr){
            System.out.println(ele);
        }


    }
}

class Phone {
    private String brand;
    private String model;
    private  double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
//        return super.toString();
        return this.brand + " "+ this.model +" "+ this.price+ " $";
    }
}

