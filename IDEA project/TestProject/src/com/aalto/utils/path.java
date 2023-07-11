package com.aalto.utils;

import com.debug_.debug03;

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

        debug03.printarray(arr);


    }
}
