package com.jpmc.inheritance;

public class InterfacesMain {
    public static void main(String[] args) {
        Printer printerObj = new PrinterImpl();
        printerObj.print("hello");
        printerObj.printNow();
        //static
        System.out.println(Printer.PI);
        Printer.doSomething();
    }
}
