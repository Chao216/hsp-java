package com.houserent.service;

import com.houserent.domain.House;
import com.houserent.utils.Utility;

public class houseService {

    private House[] houses; // create an array to store houses info.
    private int houseNum = 0;

    //use a constructor to initialize the array
    public houseService(int size) {
        houses = new House[size];
//        houses[1] = new House(2,"Peter Griffin",12345,"Germany",3000,"Open");
    }

    public House[] list() {
        return houses;
    }

    public boolean add() {
        if (houseNum < houses.length){
            System.out.println("Name : ");
            String ownerName = Utility.readString(28);
            System.out.println("phone number : ");
            int phoneNum = Utility.readInt();
            System.out.println("Country ： ");
            String country = Utility.readString(20);
            System.out.println("Monthly rent :");
            int rent = Utility.readInt();
            System.out.println("Status : ");
            String status = Utility.readString(10);
            House newhouse = new House(0,ownerName,phoneNum,country,rent,status);
            houses[houseNum] = newhouse;
            houses[houseNum].setId(houseNum);
            houseNum++;
            return true;
        }


        return false;
    }
}
