package com.morepoly.polyarray;

public class polyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Jimmy",30);
        persons[1] = new Student("Andy",18,97.2);
        persons[2] = new Student("Alfredo",21,86.9);
        persons[3] = new Teacher("Mathia",23,3500);
        persons[4] = new Teacher("Charles",42,3700);

        // this is polymorphic example
//        Person p ======》 new Sub class
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());

            // down convert with (Sub) instance.
            if (persons[i] instanceof Student){
                System.out.println(((Student)persons[i]).study());
            } else if (persons[i] instanceof Teacher){
                System.out.println(((Teacher)persons[i]).teach());
            }

        }
    }
}
