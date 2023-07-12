package com.homework.chapter7;

public class hw01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Aldof",28,"Head");
        persons[1] = new Person("Ghandi",18,"PM");
        persons[2] = new Person("Baby boss",1,"Boss");

        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i].getAge()+"\t");

        }

        // bubble sort 1 2 3 4 5
        for (int i = 0; i < persons.length-1; i++) {// only choose n-1 big man
            for (int j = 0; j < persons.length-1-i; j++) {// pairwise will be less and less
                if (persons[j].getAge() > persons[j+1].getAge()){
                    Person temp = persons[j+1];
                    persons[j+1] = persons[j];
                    persons[j] = temp;
                }

            }


        }
        System.out.println();
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i].getAge()+"\t");

        }



    }
}

class Person {
    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}