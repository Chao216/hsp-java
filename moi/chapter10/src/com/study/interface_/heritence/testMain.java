package com.study.interface_.heritence;

public class testMain {
    public static void main(String[] args) {
        laptop laptop = new laptop();
        Router.use(laptop);

        System.out.println("interfaces can extends multiple interfaces");

    }
}

class Router {
    public static void use(multiHub mh){
        mh.connectEthernet();
        mh.closeEthernet();
    }
}