package com.study.innerClass.anonymous_;

public class AnonymousInner {
    public static void main(String[] args) {
        new Outter02().metho();// this is also anonymous object
        new Outter03().trick();// another examole of annonymous inner class

    }
}

class Outter02 {
    public void metho() {
        // traditional way is create a class implements usb interface
        // but with anonymous inner class, we can do faster

        USB kamera = new USB() {// interface example
            @Override
            public void connect() {
                System.out.println("Kamera is using usb port now!");
            }
        };

        kamera.connect();
        System.out.println(kamera.getClass());

        Animal dog1 = new Animal("Lucy") {
            @Override
            void eat() {
                System.out.println(this.getName() + " enjoys eating meat !");
            }
        };
        dog1.eat();
        System.out.println(dog1.getClass());
    }

    interface USB {
        void connect();
    }

    abstract class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        abstract void eat();
    }
}

class Outter03{
    public void trick(){
        new Horse("Jack"){

            @Override
            void run() {
                System.out.println(getName()+" is running fast !"+"\n" + this.getClass());
            }
        }.run();

    }

    abstract class Horse{
        private String name;

        public Horse(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        abstract void run();
    }
}