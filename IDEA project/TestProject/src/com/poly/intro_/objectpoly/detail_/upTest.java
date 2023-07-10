package com.poly.intro_.objectpoly.detail_;

public class upTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.run();
        animal.speak();
        animal.walk();
        System.out.println("========================================");
        // also down converse
        Dog dog1 = (Dog) animal;
        dog1.eat();
        dog1.run();
        dog1.speak();
        dog1.walk();
        dog1.bark();
        ((Dog) animal).bark();


//        because animal is a dog, we just call it animal, so we can down convert into dog
    }
}
