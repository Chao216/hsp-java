package com.study.bigNUM;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bignum {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("8008208820656767867878776786867787867565454678789796");
        BigInteger bi1 = new BigInteger("40083675678131");
        System.out.println(bi1.add(bi));
        System.out.println(bi1.pow(2));

        float fl = 3.14415626562735672563762673672635627356273577365637552653725373572735735275366527356263663f;
        double d = 3.14415626562735672563762673672635627356273577365637552653725373572735735275366527356263663;
        BigDecimal bigDecimal = new BigDecimal("3.14415626562735672563762673672635627356273577365637552653725373572735735275366527356263663");
        System.out.println(fl);
        System.out.println(d);
        System.out.println(bigDecimal);
    }
}
