package com.jpmc.inheritance;

import java.time.LocalDateTime;

public interface Printer {
    double PI = 3.14; //public, static and final
    void print(String data);
    default void printNow() {
        wth();
        System.out.println(LocalDateTime.now());
    }
    private void wth() {
        System.out.println("WTH");
    }
    public static void doSomething() {
        System.out.println("Doing something");
    }
}
