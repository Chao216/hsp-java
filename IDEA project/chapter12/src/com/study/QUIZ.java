package com.study;

public class QUIZ {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("abcdefg");//0 1 2 3 4 5 6
//        sb1.reverse();
//        System.out.println(sb1);

        System.out.println(sb1);
        StringBuilder rev = customReverse(sb1,2,5);

        System.out.println(rev);







    }

    public static StringBuilder  customReverse(StringBuilder sb, int start, int end){
        if (start < 0 || end >= sb.length()){
            return null;
        }

        String sl = sb.substring(0,start);
        StringBuilder sbl = new StringBuilder(sl);
        System.out.println(sl);

        String sm = sb.substring(start,end);
        StringBuilder sbm = new StringBuilder(sm);
        sbm.reverse();
        System.out.println(sbm);

        String sr = sb.substring(end);
        System.out.println(sr);

        sbl.append(sbm).append(sr);
        System.out.println(sbl);

        return  sbl;




    }


}
