package com.jpmc.lab09;

public class Counter {
    private int value;
    private static int numberOfObjects;

    public Counter() {
        numberOfObjects++;
    }
    //Similar to destructor in C++; but deprecated in Java 15
    protected void finalize() {
        numberOfObjects--;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public int getValue() {
        return value;
    }
    public void increment() {
        value++;
        if(value > 3) {
            value = 0;
        }
    }
    public void decrement() {
        value--;
        if(value < 0) {
            value = 3;
        }
    }
}
