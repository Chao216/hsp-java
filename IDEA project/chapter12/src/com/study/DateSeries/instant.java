package com.study.DateSeries;


import java.time.Instant;
import java.util.Date;

public class instant {
    public static void main(String[] args) {
        Instant ist = Instant.now();
        System.out.println(ist);

        Date d1 = java.util.Date.from(ist);
        System.out.println(d1);
    }
}
