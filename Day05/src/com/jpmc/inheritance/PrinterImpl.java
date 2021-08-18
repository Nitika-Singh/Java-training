package com.jpmc.inheritance;

public class PrinterImpl implements Printer {
    public void print(String data) {
        System.out.println(data);
    }

//    @Override
//    public void printNow() {
//        System.out.println("printing now");
//    }
}
