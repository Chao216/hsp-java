package com.study.singleInstance;

public class hungary_mode {
    public static void main(String[] args) {
        Mother mother1 = Mother.getInstance();
        System.out.println(mother1.toString());
        System.out.println(mother1.getName());
    }

}

class Mother {
    private String name;

    // step1 privatize your constructor
    // step2 create instance inside class
    // step3 public get method to return mom instance

    private Mother(String name) {
        this.name = name;
    }
// Always remember you can use static varibale and methods without creating instance outiside.
    static Mother mom = new Mother("mama");

    public static Mother getInstance() {
        return mom;
    }
    public String getName(){
        return this.name;
    }
}