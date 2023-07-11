package com.smallchange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OPPSystem {

    // some local variables
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    int key;
    String details = "==============WePay details===================";
    // for income, let us define money, balance, date
    double money = 0;
    double balance = 0;
    Date date = new Date();
    SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String toWhom;

    public void menu(){
        do {
            // this is the menu part on screen.
            System.out.println("=========WeWillPay========== ");
            System.out.println("\t\t\t\t 1. Details");
            System.out.println("\t\t\t\t 2. Income");
            System.out.println("\t\t\t\t 3. Spending");
            System.out.println("\t\t\t\t 4. Exit");
            System.out.print("1-4, which option?");
            // this is the menu part on screen.
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    this.details();
                    break;

                case 2:
                    this.earn();
                    break;
                case 3:
                    this.spent();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("please enter 1 -4");
                    break;
            }


        } while (loop);
    }


    public void details() {
        System.out.println(details);
    }

    public void earn() {
        System.out.print("amount of money you get:");
        money = scanner.nextDouble();
        if (money > 0) {
            balance += money;
        } else {
            System.out.println("check again, non negativity!");

            return;// exit code
        }


        date = new Date();

        details += "\nget money\t" + money + "\t" + SDF.format(date) + "\t" + balance;
    }

    public void spent() {
        System.out.print("amount of money you spent:");
        money = scanner.nextDouble();


        if (money > 0 && money <= balance) {
            balance -= money;
        } else {
            System.out.println("check again, non negativity!, also make sure balance is enough !");
            return;
        }
        System.out.print("Where did you spend the money?");
        toWhom = scanner.next();




        date = new Date();
        details += "\n"+ toWhom+"\t" + money + "\t" + SDF.format(date) + "\t" + balance;
    }

    public void exit() {
        System.out.print("Are you sure you wanna quit? y/n:");
        char ans = scanner.next().charAt(0);
        if (ans == 'y') {
            loop = false;
        }
    }
}
