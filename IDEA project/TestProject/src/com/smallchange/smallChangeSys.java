package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int key;
        String details = "==============WePay details===================";


        // for income, let us define money, balance, date
        double money = 0;
        double balance = 0;

        do {
            // this is the menu part on screen.
            System.out.println("=========WePay========== ");
            System.out.println("\t\t\t\t 1. Details");
            System.out.println("\t\t\t\t 2. Income");
            System.out.println("\t\t\t\t 3. Spending");
            System.out.println("\t\t\t\t 4. Exit");
            System.out.print("1-4, which option?");
            // this is the menu part on screen.
            key = scanner.nextInt();
            Date date = new Date();
            SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


            switch (key) {
                case 1:
//                    System.out.println("check the details");
                    System.out.println("\n" + details);
                    break;

                case 2:
//                    System.out.println("Check your income");
                    System.out.print("amount of money you get:");
                    money = scanner.nextDouble();
                    if (money > 0) {
                        balance += money;
                    } else {
                        System.out.println("check again, non negativity!");

                        continue;
                    }


                    date = new Date();

                    details += "\n get money\t" + money + "\t" + SDF.format(date) + "\t" + balance;


                    break;
                case 3:
//                    System.out.println("Check your spending");
                    System.out.print("amount of money you spent:");
                    money = scanner.nextDouble();

                    if (money > 0 && money <= balance) {
                        balance -= money;
                    } else {
                        System.out.println("check again, non negativity!, also make sure balance is enough !");
                        continue;
                    }

                    date = new Date();
                    details += "\n spent money\t" + money + "\t" + SDF.format(date) + "\t" + balance;
                    break;
                case 4:
//                    System.out.println("quiting now ----------");
                    System.out.print("Are you sure you wanna quit? y/n:");
                    char ans = scanner.next().charAt(0);
                    if (ans == 'y') {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("please enter 1 -4");
                    break;
            }


        } while (loop);
    }
}
