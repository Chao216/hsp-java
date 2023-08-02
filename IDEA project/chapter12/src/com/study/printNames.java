package com.study;

import java.util.Arrays;
import java.util.Scanner;

public class printNames {
    public static void main(String[] args) {
        System.out.print("please enter your name including middle name:   ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String[] names = name.split(" ");
        String fmt = String.format("%s,%s,.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(fmt);


    }
}
