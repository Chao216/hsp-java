package com.study.enumeration;

public class enum_ {
    public static void main(String[] args) {

        Student pupil = Student.PreSchool;
        System.out.println(pupil.getDifficulity());
        System.out.println(Color.BLUE);
        for (Color someting: Color.values()){ // here , something is designed as varibale name;
            System.out.println(someting);
        }

    }
}

// replace class with enum

enum Student {
    PreSchool("elementary", "Easy"), MiddleSchool("junior High School", "easy"), HighSchool("High School", "Hard"), Uni("University", "Depends");
    private String name;
    private String difficulity;

    Student(String name, String difficulity) {
        this.name = name;
        this.difficulity = difficulity;
    }

    public String getName() {
        return name;
    }

    public String getDifficulity() {
        return difficulity;
    }
}

enum Color {
    RED, GREEN, BLUE;
}
