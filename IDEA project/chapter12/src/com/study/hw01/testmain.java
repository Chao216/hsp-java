package com.study.hw01;

public class testmain {
    public static void main(String[] args) {
        try {
            if(args.length != 2){throw new RuntimeException("number of arguments not correct");}

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println(Solution.Cal(n1,n2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}

class Solution {
    public static double Cal(int n1, int n2) {
        return n1 / n2;
    }
}
