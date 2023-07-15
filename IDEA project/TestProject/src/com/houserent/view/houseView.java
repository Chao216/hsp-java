package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.houseService;
import com.houserent.utils.Utility;

public class houseView {
    private boolean run = true;
    private char ans;
    private houseService hs = new houseService(10);

    public void listHouse() {
        System.out.println("=======HOUSES LIST==========");
        System.out.println("============================");
        House[] houses = hs.list();// returned a houses array
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            }

        }


    }

    public void deleteHouse() {
        System.out.println("ARE YOU SURE YOU WANT TO DELETE A HOUSE ?");
        System.out.println("PLEASE ENTER THE HOUSE ID THAT YOU WANT TO DELETE (-1 FOR GIVE UP): ");
        int delID = Utility.readInt();
        if (delID == -1) {
            System.out.println("YOU HAVE GIVEN UP DELETING A HOUSE.");
            return;// exit the method
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            // for sure delete
            hs.del(delID);
        } else {
            System.out.println("YOU HAVE CHOSEN TO NOT DELETE !");
        }

    }

    public void exit() {
        char ans = Utility.readConfirmSelection();
        if (ans == 'Y') {
            run = false;
        }
    }

    public void search() {
        System.out.println("please enter the id of house you are searching for: ");
        int searchID = Utility.readInt();
        House res = hs.search(searchID);
        System.out.println(res);

    }

    public void modify(){
        System.out.println("Please enter the id of house you want to change info");
        System.out.println("what is the id of house you want to update:");
        int updateID = Utility.readInt();
        House toModify = hs.search(updateID);
        System.out.print("NAME " +toModify.getOwner()+" : ");
        String newName = Utility.readString(10);
        if(!"".equals(newName)){
            toModify.setOwner(newName);
        }

        System.out.print("PHONE " +toModify.getPhone()+" : ");
        int newPhone = Utility.readInt();
        if(!"".equals(newPhone)){
            toModify.setPhone(newPhone);
        }

        System.out.print("COUNTRY " +toModify.getLocation()+" : ");
        String newLocation = Utility.readString(10);
        if(!"".equals(newLocation)){
            toModify.setLocation(newLocation);
        }

        System.out.print("RENT " +toModify.getRent()+" : ");
        int newRent = Utility.readInt();
        if(!"".equals(newRent)){
            toModify.setRent(newRent);
        }

        System.out.print("STATUS " +toModify.getStatus()+" : ");
        String newStatus = Utility.readString(10);
        if(!"".equals(newStatus)){
            toModify.setStatus(newStatus);
        }



    }

    public void menu() {
        do {
            System.out.println("=====NOTE-BOARD HOUSE RENTING===== ");
            System.out.println("\t\t\t1. ADD NEW HOUSE");
            System.out.println("\t\t\t2. SEARCH HOUSE");
            System.out.println("\t\t\t3. DELETE HOUSE");
            System.out.println("\t\t\t4. MODIFY HOUSE");
            System.out.println("\t\t\t5. HOUSE LIST");
            System.out.println("\t\t\t6. EXIT");
            System.out.print("WHAT OPERATION YOU WANT TO PERFORM ? 1-6:   ");

            ans = Utility.readChar();

            switch (ans) {
                case '1':
                    System.out.println("ADD");
                    hs.add();
                    break;
                case '2':
//                    System.out.println("SEARCH");
                    search();

                    break;
                case '3':
                    System.out.println("DELETE");
                    deleteHouse();
                    break;
                case '4':
//                    System.out.println("MODIFY");
                    modify();
                    break;
                case '5':
                    System.out.println("LIST");
                    listHouse();
                    break;
                case '6':
//                    System.out.println("EXIT");
//                    run = false;
                    exit();
                    break;
                default:
                    System.out.println("ERROR COMMAND !");
                    break;

            }

        } while (run);
    }
}
