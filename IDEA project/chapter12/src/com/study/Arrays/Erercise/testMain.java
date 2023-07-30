package com.study.Arrays.Erercise;

import java.util.Arrays;
import java.util.Comparator;

public class testMain {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Spider man",3.99);
        books[1] = new Book("Batman",4.99);
        books[2] = new Book("Joker",2.99);
        books[3] = new Book("And then there were none",1.99);
        books[4] = new Book("Snoppy",0.99);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName()+"\t"+books[i].getPrice());

        }
        
        bubleSort(books, new Comparator() {// this is anonymous class inplements Comparator
            @Override
            public int compare(Object o, Object t1) {
//                return 0;
                double d1 = (Double) o;
                double d2 = (Double) t1;
                return (int) (d2 - d1);// here we just need a value either positive or negative.
                // if d2 > d1, swap happen, small ones move to the right *** Big ---> small*
                // case d1 -d2
                // if d1 > d2, swap happen big ones go to right, *** small----->BIG!
            }
        });

        System.out.println("====we have sorted now based on price");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName()+"\t"+books[i].getPrice());

        }
    }

    public static void bubleSort(Book[] books, Comparator comp){
        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1-i; j++) {
                if (comp.compare(books[j].getPrice(),books[j+1].getPrice())>0){
                    Book temp = books[j+1];
                    books[j+1] = books[j];
                    books[j] = temp;
                }

            }

        }
    }
}
