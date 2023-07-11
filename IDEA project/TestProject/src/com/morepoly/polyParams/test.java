package com.morepoly.polyParams;

public class test {
    public static void main(String[] args) {
        Employee tom = new Worker("Tom", 5600);
        Employee libing = new Manager("Libing", 7000, 30000);

        System.out.println(tom.getAnnual());
        System.out.println(libing.getAnnual());

        Employee[] employees = new Employee[2];
        employees[0] = tom;
        employees[1] = libing;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Worker){
                ((Worker) employees[i]).work();
            } else if (employees[i] instanceof Manager){
                ((Manager) employees[i]).manage();
            } else {
                // do nothing
            }

        }


    }
}
