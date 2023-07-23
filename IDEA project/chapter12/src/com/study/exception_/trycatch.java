package com.study.exception_;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        new Solution().getInteger();


    }
}

class Solution {
    public void getInteger() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("please give me a integr: ");
            int n1 = scanner.nextInt();
        } catch (Exception e){
            System.out.println(e.getMessage());
            getInteger();
        }finally {
            System.out.println("you have entered a integer");
        }
    }
}
