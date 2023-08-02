package com.study.DateSeries;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class loCale {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getMonth());
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ldt1 = LocalDateTime.of(1997,2,16,15,3);
        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfWeek());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/DD HH:MM:SS");
        System.out.println(dtf.format(ldt));
    }
}
