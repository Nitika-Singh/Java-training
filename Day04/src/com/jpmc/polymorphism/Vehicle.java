package com.jpmc.polymorphism;

public class Vehicle {
    private String chassisNo;
    public void printDetails() {
        System.out.println("****Vehicle with chassisNo: " + chassisNo);
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }
}
