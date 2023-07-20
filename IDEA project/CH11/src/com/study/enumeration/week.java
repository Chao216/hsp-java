package com.study.enumeration;

public class week {
    public static void main(String[] args) {
        for (Days element : Days.values()) {
            System.out.println(element);
        }
        System.out.println(Days.FRIDAY.compareTo(Days.SUNDAY));
        System.out.println(Days.FRIDAY.name());
        System.out.println(Days.FRIDAY.ordinal());
        System.out.println(Days.FRIDAY.toString());

    }
}

enum Days {
    MONDAY("礼拜一"), TUESDAY("礼拜二"), WEDNESDAY("礼拜三"), THURSDAY("礼拜四"), FRIDAY("礼拜五"), SATURDAY("礼拜六"), SUNDAY("礼拜天");
    private String kina;
    private Days(String kina) {
        this.kina = kina;
    }

    @Override
    public String toString() {
        return kina;
    }
}
