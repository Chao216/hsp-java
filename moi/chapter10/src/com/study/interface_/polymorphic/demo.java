package com.study.interface_.polymorphic;

public class demo {
    public static void main(String[] args) {
        USB[] usbdevices = new USB[2];
        usbdevices[0] = new phone();
        usbdevices[1] = new kamera();
// SEE, it is vert similar to polymorphic of classes array!
        for (int i = 0; i < usbdevices.length; i++) {
            usbdevices[i].work();
            if(usbdevices[i] instanceof kamera){
                ((kamera) usbdevices[i]).shot();
            } else if (usbdevices[i] instanceof phone) {
                ((phone) usbdevices[i]).call();

            }

        }
    }
}

interface USB {
    void work();
}

class phone implements USB{
    @Override
    public void work() {
        System.out.println("Phone is using USB");
    }
    public void call(){System.out.println("Hello I am calling");}
}

class kamera implements USB{
    @Override
    public void work() {
        System.out.println("Kamera is using USB");
    }
    public void shot(){System.out.println("I am taking a photo");}
}
