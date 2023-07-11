package com.object_.intro;

public class finalize_ {

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes");
        // when assign null, it means break link to heap
        mercedes = null;

        System.gc();// manually call system to clean waste memory

        System.out.println("This is the end of codes!");
    }

}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println(this.name + " will be cleaned out!");
        System.out.println("We will recycling some resources");
    }
}

