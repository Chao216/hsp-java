package com.study.String_;

import java.util.Scanner;

public class comma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("plese writhe down the price:  ");
        String money = scanner.next();
        StringBuffer moneyBuffer = new StringBuffer(money);
        // for example
        // 1234543.34
        // find ., index as idx
        // insert comma at idx -3
        for (int i = moneyBuffer.lastIndexOf("."); i > 3; i -= 3){
            moneyBuffer.insert(i-3,",");
        }
        System.out.println(moneyBuffer);

    }
}
