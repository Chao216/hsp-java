package com.study.interface_;

public class testMain {
    public static void main(String[] args) {


        iphone iphone = new iphone();
        Xiaomi xiaomi = new Xiaomi();
        adapter.plug(iphone);// plug is static method
        adapter.plug(xiaomi);// plug is static method
        adapter.streaming(iphone);
        threePoint5.message();// you can call static method from interface directly!

        ipod ipod = new ipod();
        new Speaker().use(ipod);

    }
}

class Speaker {
    public void use(threePoint5 tpf) {
        tpf.alert();
        tpf.connect();

    }
}
