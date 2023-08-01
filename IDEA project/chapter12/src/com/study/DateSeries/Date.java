package com.study.DateSeries;

import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");
        System.out.println(simpleDateFormat.format(date));
    }
}
