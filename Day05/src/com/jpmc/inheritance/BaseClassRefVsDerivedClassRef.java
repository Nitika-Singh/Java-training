package com.jpmc.inheritance;

public class BaseClassRefVsDerivedClassRef {
    public static void main(String[] args) {
        Car car = new Car(); //TIED TO THE Car Implementation
        //car = new Truck();
        //car = new Bus();

        Vehicle vehicle = new Car(); //RECOMMENDED STYLE
        //vehicle.driveFast();
        vehicle.drive();
        vehicle = new Truck();
        vehicle = new Bus();
        vehicle = new Van();

        //Account acc = new CurrentAccount();
        //acc = new PremiumCurrentAccount();

        //CurrentAccount acc = new CurrentAccount(); //TIED TO THE CurrentAccount Implementation

    }
}

class Vehicle {
    public void drive() {}
}
class Van extends Vehicle {}
class Car extends Vehicle {
    public void drive() { driveFast();}
    public void driveFast(){}
}
class Truck extends Vehicle {}
class Bus extends Vehicle {}