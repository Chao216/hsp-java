package com.study.System_;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int[] src = {0,1,2,3,4,5,6,7,8,9};
        int dest[] = new int[5];
        System.arraycopy(src,5,dest,0,5);
        System.out.println(Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());
        System.gc();
    }
}
