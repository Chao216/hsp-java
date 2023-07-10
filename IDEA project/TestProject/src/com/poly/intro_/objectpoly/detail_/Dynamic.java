package com.poly.intro_.objectpoly.detail_;

public class Dynamic {

    // let us learn about dynamic
    // when we use method, it will be binded to running class
    // when we use properties, it uses nearest value.

    public static void main(String[] args) {
        AA aa = new BB();
        System.out.println(aa.increase_());

        // if you use getI() it will goes to B
        // ifyou use i, it will find it in A as first attempt.
    }
}

class AA {
    public int n1 = 10;
    public int getN1(){
        return n1;
    }

    public int increase(){
        return n1 + 10;
    }

    public int increase_(){
        return getN1() + 10;
    }
}

class BB extends AA{
//    public int n1 = 20;

    public int getN1(){
        return  n1;
    }
//    public int increase(){
//        return n1 + 20;
//    }
//    public int increase_(){
//        return getN1() + 20;
//    }
}
