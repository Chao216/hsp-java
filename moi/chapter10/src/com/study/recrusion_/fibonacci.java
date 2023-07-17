package com.study.recrusion_;

public class fibonacci {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.println(calFibo.Fibo(i));

        }
    }
}
class calFibo{
    public static int Fibo(int n){
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return Fibo(n-1)+Fibo(n-2);
        }
    }
}
