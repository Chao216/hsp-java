package com.study.abstract_;

public class testMain {
    public static void main(String[] args) {
        lineworker peter = new lineworker("peter", 29, 3200);
        manager joe = new manager("Joe", 41, 4300);
        peter.work();
        joe.work();
    }
}
