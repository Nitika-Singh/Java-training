package com.jpmc.inheritance;

public class User {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setChassisNo("EREG3243243432423");
        bmw.setModel("BMW i-series");
        bmw.setColor("Black");
        bmw.start();
        bmw.drive();
        bmw.applyBrakes();
        bmw.stop();

    }
}

//WRONG DESIGN
//Induction Stove is NOT a Vehicle
//class InductionStove extends Vehicle {
//
//}