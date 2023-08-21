package com.study.File;

import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) {
        try {
            File newFile = new File("test.txt");
            if (newFile.createNewFile()) {
                System.out.println("file " + newFile.getName() + " successfully created!");
            } else {
                System.out.println("File " + newFile.getName() + " already existed!");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this sentence is printed in the finally block");
        }

    }

}
