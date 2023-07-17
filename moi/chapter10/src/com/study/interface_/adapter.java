package com.study.interface_;

public class adapter {
    public static void plug(USB usb){
        usb.start();
        usb.stop();
    }

    public static void streaming(HDMI hdmi){
        hdmi.output();
    }
}
