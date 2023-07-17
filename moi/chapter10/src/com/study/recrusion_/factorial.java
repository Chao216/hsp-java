package com.study.recrusion_;

public class factorial {
    public static void main(String[] args) {

        System.out.println(calfact.facto(19));


    }

}

class calfact{
    public static long facto(long n){
        if(n == 0l || n == 1l){
            return 1l;
        } else {
            return (long)n * facto((long)(n-1));
        }
    }
}
