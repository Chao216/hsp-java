package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.houseService;
import com.houserent.utils.Utility;

public class houseView {
    private boolean run = true;
    private char ans;
    private houseService hs = new houseService(10);

    public void listHouse(){
        System.out.println("=======HOUSES LIST==========");
        System.out.println("============================");
        House[] houses = hs.list();// returned a houses array
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]!=null){
                System.out.println(houses[i]);
            }

        }



    }

    public void deleteHouse(){
        System.out.println("ARE YOU SURE YOU WANT TO DELETE A HOUSE ?");
        System.out.println("PLEASE ENTER THE HOUSE ID THAT YOU WANT TO DELETE (-1 FOR GIVE UP): ");
        int delID = Utility.readInt();
        if (delID == -1){
            System.out.println("YOU HAVE GIVEN UP DELETING A HOUSE.");
            return;// exit the method
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            // for sure delete
            hs.del(delID);
        } else {
            System.out.println("YOU HAVE CHOSEN TO NOT DELETE !");
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
            System.out.println("\t\t\t5. EXIT");
            System.out.print("WHAT OPERATION YOU WANT TO PERFORM ? 1-6:   ");

            ans = Utility.readChar();

            switch (ans) {
                case '1':
                    System.out.println("ADD");
                    hs.add();
                    break;
                case '2':
                    System.out.println("SEARCH");
                    break;
                case '3':
                    System.out.println("DELETE");
                    deleteHouse();
                    break;
                case '4':
                    System.out.println("MODIFY");
                    break;
                case '5':
                    System.out.println("LIST");
                    listHouse();
                    break;
                case '6':
                    System.out.println("EXIT");
                    run = false;
                    break;
                default:
                    System.out.println("ERROR COMMAND !");
                    break;

            }

        } while (run);
    }
}
