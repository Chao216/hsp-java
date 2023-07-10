package com.poly.intro_.objectpoly;

public class testmorpho {
    public static void main(String[] args) {
        Master Chiang = new Master("Chiang Kai-SHik");
        Grass nzGrass = new Grass("fresh new zealand grass");
        Sheep sheep1 = new Sheep("Shon");
        Chiang.feed(sheep1,nzGrass);
        Wolf wolf1 = new Wolf("灰太狼");
        Meat meat1 = new Meat("小肥羊");
        Chiang.feed(wolf1,meat1);
    }
}
