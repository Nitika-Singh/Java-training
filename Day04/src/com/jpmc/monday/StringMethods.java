package com.jpmc.monday;

public class StringMethods {
    public static void main(String[] args) {
        String str = "+5";
        char plusOrMinus = str.charAt(0);
        char value = str.charAt(1);

        System.out.println(plusOrMinus + "" + value);
        //"+16 -90"
        str = "+16";
        plusOrMinus = str.charAt(0);
        //String numInStr = str.substring(1);
        String numInStr = str.substring(str.indexOf(plusOrMinus) + 1);
        System.out.println(plusOrMinus + "" + numInStr);
    }
}
