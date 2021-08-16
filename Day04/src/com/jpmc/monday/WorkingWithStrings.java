package com.jpmc.monday;

public class WorkingWithStrings {
    public static void main(String[] args) {
        //Thread safe
        StringBuffer strBuffer = new StringBuffer("");
        strBuffer.append("Today ");
        strBuffer.append("is ");
        strBuffer.append("the ");
        strBuffer.append("beginning ");
        strBuffer.append("of ");
        strBuffer.append("a ");
        strBuffer.append("new ");
        strBuffer.append("week.");

        System.out.println(strBuffer.toString());

        //No thread safe
        StringBuilder strBuilder = new StringBuilder("");
        strBuilder.append("Today ");
        strBuilder.append("is ");
        strBuilder.append("the ");
        strBuilder.append("beginning ");
        strBuilder.append("of ");
        strBuilder.append("a ");
        strBuilder.append("new ");
        strBuilder.append("week.");

        System.out.println(strBuilder.toString());

    }
}
