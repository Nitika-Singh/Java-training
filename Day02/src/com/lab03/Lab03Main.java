package com.lab03;

public class Lab03Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.model = "BMW";
        System.out.println(bmw.model);
        //bmw.power = 2000;
        //bmw.engine.power = 2000; //NPE

        Engine e = new Engine();
        e.power = 2000;

        //bmw.engine = e;
        bmw.engine.power = 3000;
        System.out.println(bmw.engine.power);
    }
}
