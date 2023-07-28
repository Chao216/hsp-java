package com.study.String_;

public class bufferMethod {
    public static void main(String[] args) {
        StringBuffer nums = new StringBuffer("零一二三四五六七八九十");
        System.out.println(nums);
        nums.delete(0,2);// index [0,2) will be affected
        System.out.println(nums);
        nums.insert(0,"零一");
        System.out.println(nums);
        nums.replace(5,7,"567");// delete [5,7) and insert(5,"567")
        System.out.println(nums);



    }
}
