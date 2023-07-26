package com.study.String_;

public class StringBuffer_ {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("Hello World !");
        String str1 = "Hello World !";
        // String to StringBuffer
        StringBuffer stringBuffer2 = new StringBuffer(str1);
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = stringBuffer3.append(str1);
        System.out.println(stringBuffer2==stringBuffer4);
        System.out.println(stringBuffer2.equals(stringBuffer4));
        System.out.println(stringBuffer2);

        // from stringBuffer to String
        String string4 = stringBuffer4.toString();
        String s1 = new String(stringBuffer2);

    }
}
