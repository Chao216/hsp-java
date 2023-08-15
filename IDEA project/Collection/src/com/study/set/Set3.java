package com.study.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set3 {
    public static void main(String[] args) {
        Set set3 = new HashSet();

        set3.add(new Employee("Tim"));
        set3.add(new Employee("Tim"));
        set3.add(new Employee("Harry"));
        set3.add(new Employee("Peter"));
        set3.add(new Employee("Peter"));
        System.out.println(set3);

        Iterator iterator = set3.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Employee employee = (Employee) next;
            employee.selfclaim();

        }
        System.out.println("#####################################");
        for (Object o : set3) {
            Employee employee = (Employee) o;
            employee.selfclaim();

        }
        // Note New String objects might point to the same address in CONSTANT Pool.
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}

class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void selfclaim(){
        System.out.println("This is "+ name);
    }

    @Override
    public String toString() {
        return "Employee = " + name;
    }
}