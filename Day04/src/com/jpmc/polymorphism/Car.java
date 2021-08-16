package com.jpmc.polymorphism;

public class Car extends Vehicle {
    public void printDetails() {
        System.out.println("HONK HONK HONK " + getChassisNo());
    }
}
