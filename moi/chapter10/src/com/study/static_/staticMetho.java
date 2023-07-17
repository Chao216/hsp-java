package com.study.static_;

public class staticMetho {
    public static void main(String[] args) {
        Student ella = new Student("Ella");
        ella.pay(300);
        Student tom = new Student("tom");
        tom.pay(300);
        Student.showFee();// static method can be access with CLass.Metho
        System.out.println(Math.sqrt(100));
        double[] arr1 = {1.3, 2.5, 0.99, 1.13};
        System.out.println(mytools.sumArray(arr1));// static method is useful;

    }
}

class Student {
    private String name;
    public static double fee;

    public Student(String name) {
        this.name = name;
    }

    public static void pay(double tuition) {
        Student.fee += tuition;

    }

    public static void showFee() {
        System.out.println("we have collected " + Student.fee + "Yuan in total.");
    }
}

class mytools {
    public static double sumArray(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }
}