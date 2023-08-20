package com.study.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class linkedHS {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        System.out.println(linkedHashSet.add(new Coffee("Americano",10)));
        System.out.println(linkedHashSet.add(new Coffee("Americano",10)));
        System.out.println(linkedHashSet.add(new Coffee("Latte",10)));
        System.out.println(linkedHashSet.add(new Coffee("Flat WHite",10)));
        System.out.println(linkedHashSet);

        Iterator iterator = linkedHashSet.iterator();
        System.out.println("=============iterator=====================");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Coffee coffee = (Coffee) next;
            System.out.println(coffee.name);
            System.out.println(coffee.price);
            System.out.println();
        }

        System.out.println("=========use for each==================");
        for (Object o : linkedHashSet) {
            Coffee cf = (Coffee) o;
            System.out.println(cf.name);
            System.out.println(cf.price);
            System.out.println();

        }




    }
}
class Coffee{
    public String name;
    public double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(price, coffee.price) == 0 && Objects.equals(name, coffee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // let us overwrite toString

    @Override
    public String toString() {
        return name + " " + price + "#";
    }
}
