package com.houserent.domain;

public class House {
    private int id;
    private String owner;
    private int phone;
    private String location;
    private double rent;
    private String status;

    public House(int id, String owner, int phone, String location, double rent, String status) {
        this.id = id;
        this.owner = owner;
        this.phone = phone;
        this.location = location;
        this.rent = rent;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id +
                "\t" + owner +
                "\t" + phone +
                "\t" + location +
                "\t" + rent +
                "\t" + status;
    }
}
