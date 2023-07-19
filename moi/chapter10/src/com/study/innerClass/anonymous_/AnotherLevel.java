package com.study.innerClass.anonymous_;

public class AnotherLevel {
    public static void main(String[] args) {

        run(new HDMI() {// becasue it is static, we can call it here.
            @Override
            public void outPutSignal() {
                System.out.println("signal is outputed to Samsung LED TV!");
            }

            @Override
            public void showaddress() {
                System.out.println(this.getClass());
            }
        });

        // let us use anonymous class
        wake(new Bell() {
            @Override
            public void alarm() {
                System.out.println("Lazy boy, wake up, it is time to learn Java  !");
            }
        });

    }

    public static void run(HDMI hdmi){
        // create class implements HDMI
        // create an instance ,and call it
        hdmi.outPutSignal();// you can pass interface into function, remember computer, USB example?
        hdmi.showaddress();

    }
    public static void wake(Bell bell){
        bell.alarm();
    }

    interface HDMI{
        void outPutSignal();
        void showaddress();
    }

    interface Bell{
        void alarm();
    }
}
