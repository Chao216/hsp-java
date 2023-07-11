package com.smallchange;

import java.util.Scanner;

public class smallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int key;

        do {
            System.out.println("=========WePay========== ");
            System.out.println("\t\t\t\t 1. Details");
            System.out.println("\t\t\t\t 2. Income");
            System.out.println("\t\t\t\t 3. Spending");
            System.out.println("\t\t\t\t 4. Exit");
            System.out.print("1-4, which option?");
            key = scanner.nextInt();
            switch (key){
                case 1:
                    System.out.println("check the details");
                    break;
                case 2:
                    System.out.println("Check your income");
                    break;
                case 3:
                    System.out.println("Check your spending");
                    break;
                case 4:
                    System.out.println("quiting now ----------");
                    loop =  false;
                    break;
                default:
                    System.out.println("please enter 1 -4");
                    break;
            }


        } while (loop);
    }
}
