package com.jpmc.inheritance;

//Car derives from Vehicle
//Car extends Vehicle
//Car is the derived class and Vehicle is the base class
//Car is the sub class and Vehicle is the parent class
//Extensibility
public class Car extends Vehicle {
    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive() {}
    public void applyBrakes() {}
}
