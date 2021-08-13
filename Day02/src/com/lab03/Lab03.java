package com.lab03;

public class Lab03 {
    public static void main(String[] args) {
        Person sam = new Person();
        sam.name = "Sam";

        Car bmw = new Car();
        bmw.color = "Black";
        bmw.model = "BMW";
        Engine bmwEngine = new Engine();
        bmwEngine.power = 2000;
        bmw.engine = bmwEngine;

        Car santro = new Car();
        santro.color = "Yellow";
        santro.model = "Santro";
        Engine santroEngine = new Engine();
        santroEngine.power = 1000;
        santro.engine = santroEngine;

        sam.carCollection = new Car[2];
        sam.carCollection[0] = santro;
        sam.carCollection[1] = bmw;

        Person ram = new Person();
        ram.name = "Ram";
        sam.friend = ram;
        ram.friend = sam;

        System.out.println(ram.friend.carCollection[0].model);
        if(ram.carCollection == null) {
            System.out.println(ram.name + " has no cars");
        }

        System.out.println(sam.carCollection[1].engine.power);

    }
}
