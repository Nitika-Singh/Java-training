package com.jpmc.polymorphism;

public class Truck extends Vehicle {
    public void printDetails() {
        System.out.println("BAM BAM BAM " + getChassisNo());
    }
}
