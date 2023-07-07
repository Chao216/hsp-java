package com.aalto.utils;

import java.util.Arrays;
import java.util.Scanner;

public class path {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("how many elements in array?");
        int num = myScanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 100 + 1);

        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");

        }

        Arrays.sort(arr);

        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");

        }



    }
}
