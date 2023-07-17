package com.study.interface_;

public class testMain {
    public static void main(String[] args) {


        iphone iphone = new iphone();
        Xiaomi xiaomi = new Xiaomi();
        adapter.plug(iphone);// plug is static method
        adapter.plug(xiaomi);// plug is static method
        adapter.streaming(iphone);

    }
}
