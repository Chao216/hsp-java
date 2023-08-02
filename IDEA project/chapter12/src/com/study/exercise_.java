package com.study;

import java.util.Scanner;

public class exercise_ {
    public static void main(String[] args) {
        System.out.print("please enter username:   ");
        Scanner scanner = new Scanner(System.in);
        try {
            String usrname = scanner.next();
            if (usrname.length() < 2 || usrname.length() > 4){
                throw new RuntimeException("user name should be between 2 and 4 digits");
            }
            System.out.println("your user name = " + usrname);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.print("please your pin:   ");
            String pin = scanner.next();
            int pinCode = 111111;
            if (pin.length()==6){
                pinCode = Integer.parseInt(pin);
            } else {
                throw  new RuntimeException("six digits number only !");
            }

            System.out.println("your pin is  "+ pinCode);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.print("what is email address:   ");
            String email = scanner.next();
            int at = email.indexOf("@");
            int dot = email.indexOf(".");
            if(!(at > 0 && dot > at)){
                throw new RuntimeException("@ must be placed before .");
            }
            System.out.println("your email address is    " + email);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
