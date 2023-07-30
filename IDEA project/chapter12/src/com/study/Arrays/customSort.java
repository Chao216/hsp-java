package com.study.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class customSort {
    public static void main(String[] args) {
        int[] arr = {10,23,1,-19,7,230,23,11,-98,77,3,0,32};
        System.out.println("=======unsorted array=======");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr, new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
//                return 0;
                int n1 = (Integer) o;
                int n2 = (Integer) t1;
                return n2 - n1;// trick is here,
                // n1 - n2 > 0 means n1 > n2, swap , small ---> big
                // n2 - n1 > 0 means n1 < n2 , swap ,  big ---> small.
            }
        });

        System.out.println("======Sorted Array======");
        System.out.println(Arrays.toString(arr));
    }



    public static void bubbleSort(int[] array, Comparator c){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(c.compare(array[j],array[j+1])>0){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }

            }

        }
    }
}
