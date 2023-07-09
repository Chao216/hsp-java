package com.extends_;

public class PC extends Computer{
    private String brand;

    public PC(String processor, int RAM, int storage, String brand) {
        super(processor, RAM, storage);// this is done auto by IDEA
        this.brand = brand;
    }

    public void tellMe(){
        System.out.println("THIS PC ====================");
        System.out.println(getInfo()+" Brand = " +brand );// getinfo returns a String
    }
}
