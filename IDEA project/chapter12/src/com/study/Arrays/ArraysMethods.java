package com.study.Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] array1 = {20,11,25,98,23,12,9,87,2,43};
        Arrays.sort(array1);// this will soft array
        System.out.println(Arrays.toString(array1));// convert to [ ele, ment, s] style
        // sorted array1 [2, 9, 11, 12, 20, 23, 25, 43, 87, 98]
        System.out.println(Arrays.binarySearch(array1,11));// find index of element 11
        System.out.println(Arrays.binarySearch(array1,10));// -(2+1) 2 is index of 9, so 10 should be 3 if exist
        // you can think -3 as imaginary index of element 10
        int[] array2 = Arrays.copyOf(array1,array1.length);// array to copy, and how many elements to copy
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.equals(array2,array1));
//        List<int[]> list = Arrays.asList(array2);
        List list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println(list.getClass());
        System.out.println(list);

    }
}
