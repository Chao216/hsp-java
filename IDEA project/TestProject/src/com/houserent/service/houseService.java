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
        if (houseNum < houses.length) {
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
            House newhouse = new House(0, ownerName, phoneNum, country, rent, status);
            houses[houseNum] = newhouse;
            houses[houseNum].setId(houseNum);
            houseNum++;
            return true;
        }


        return false;
    }

    public boolean del(int delID) {
        int index = -1;// by default choose -1
        for (int i = 0; i <= houseNum; i++) {
            if (houses[i] != null && delID == houses[i].getId()) {
                index = i;// which means we did find the house
            }

        }

        if (index == -1) {
            return false;// we didn't find such a house
        }

        for (int i = index; i < houseNum; i++) {// from the one to be deleted to end of list
            houses[i] = houses[i + 1];// move to the left by one position


        }
        houses[houseNum] = null;
        houseNum--;
        return true;
    }

    public House search(int searchID) {
        int index = -1;// by default assume not exist
        for (int i = 0; i < houseNum; i++) {
            if (houses[i] != null && houses[i].getId() == searchID) {
                return houses[i];

            }

        }
        return null;
    }

//    public void updateHouse(int updateID){
//        System.out.println("you are updating info for house ");
//
//    }


}
