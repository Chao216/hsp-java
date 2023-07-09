package com.poly.intro_;

public class polyTest {
    public static void main(String[] args) {
        Animal animal = new Cat();//编译类 Animal, 运行类Cat
        animal.speak();
        animal = new Dog(); //编译类还是ANmial, 运行类为Dog
        animal.speak();
        //Animal 是 Dog, Cat 的父类。
    }
}
