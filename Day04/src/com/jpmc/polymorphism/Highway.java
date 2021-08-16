package com.jpmc.polymorphism;

public class Highway {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setChassisNo("TRUCK12313");

        Car car = new Car();
        car.setChassisNo("CAR2987897");

        Jeep jeep = new Jeep();
        jeep.setChassisNo("JEEP87489327");

        Bicycle cycle = new Bicycle();
        passThroughToll(truck);
        passThroughToll(car);
        passThroughToll(jeep);
        //passThroughToll(cycle);
        //Vehicle v = new String("32848");
        //Vehicle v = new int[10];
        //Vehicle v = new Car();
        //Vehicle v = new Bicycle();

        // Vehicle v = new Vehicle();
//        Vehicle c = new Car();
//        Vehicle t = new Truck();
//        Vehicle j = new Jeep();
    }
    static void passThroughToll(Vehicle vehicle) {
        //SINGLE INTERFACE BUT DIFFERENT RESPONSES
        vehicle.printDetails();
        //is vehicle a Car object? yes?
        //call car's printDetails
        //is vehicle a Truck object? yes?
        //call truck's printDetails
        //otherwise just call the default printDetails()
    }
}
