package com.jpmc;

//MoreOnStatic.main(...)
public class MoreOnStatic {
    public static void main(String[] args) {
        //No need to create an object to access a static member
        //First time you access a class by using className.variable or className.method or creating an instance
//        System.out.println(Player.salaryCap);
//        System.out.println(Player.salaryCap);
//        System.out.println(Player.salaryCap);
        System.out.println(Player.getSalaryCap());
        Player roger = new Player(324334);
        Player serena = new Player(324124);
        Animal.makeNoise();
        Dog.makeNoise();
        //There is no overriding in static methods
        //So static methods cannot take part in polymorphism
        //In other words, static methods have an impact of "Extensibility"
        //Considered poor design
    }
}

class Animal {
    public static void makeNoise() {}
}
class Dog extends Animal {
    public static void makeNoise() {}
}

class Player {
    public long salary;
    public static long salaryCap;
    static {
        System.out.println("******static block called");
    }
    //A static method cannot access a non-static member directly
    public static long getSalaryCap() {
        //salary = 122313; //ERROR
        return salaryCap;
    }

    public Player(long salary) {
        System.out.println("---constructor called");
        this.salary = salary;
    }
}
