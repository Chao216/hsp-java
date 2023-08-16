package com.study.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class hashEquals {
    public static void main(String[] args) {
        Set set = new HashSet();

        System.out.println(set.add(new Book("And Then There Were None",9.9)));
        System.out.println(set.add(new Book("And Then There Were None",9.9)));
        System.out.println(set.add(new Book("And Then There Were None",9.9)));
        System.out.println(set.add(new Book("And Then There Were None",9.8)));
        System.out.println(set.add(new Book("Batman VS Superman",9.9)));
        System.out.println(set);

        System.out.println("==============================");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Book book = (Book) next;
            System.out.println(book.getTitle() + "\t" + book.getPrice());

        }
        System.out.println("iter enhenced for loop");
        for (Object o : set) {

            Book book = (Book) o;
            System.out.println(book.getTitle() + "\t" + book.getPrice());


        }

    }
}

class Book{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}