package com.study.enumeration;

public class week {
    public static void main(String[] args) {
        for (Days element : Days.values()) {
            System.out.println(element);
        }
        System.out.println(Days.FRIDAY.compareTo(Days.SUNDAY));
        System.out.println(Days.FRIDAY.name());
        System.out.println(Days.FRIDAY.ordinal());

    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
