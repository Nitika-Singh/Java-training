package com.jpmc.inheritance;

public class Abstraction {
    public static void main(String[] args) {
        Animal snoopy = new Dog();
        Animal snow = new Cat();
        snoopy.makeNoise();
        snow.makeNoise();
        //Animal animal = new Animal();
    }
}

abstract class Cipher {
    abstract void encrypt();
    abstract void decrypt();
}

class ComplexCipher extends Cipher {
    @Override
    void encrypt() {
    }
    @Override
    void decrypt() {
    }
}

class SimpleCipher extends Cipher {
    @Override
    void encrypt() {
    }
    @Override
    void decrypt() {
    }
}


abstract class Animal {
    private int eyes;
    public Animal() {}
    public int getEyes() {
        return eyes;
    }
    abstract void makeNoise();
}
class Dog extends Animal {
    void makeNoise() {
        System.out.println("Bow bow");
    }
    //abstract void move();
}
class Cat extends Animal {
    void makeNoise() {
        System.out.println("meow meow");
    }
}