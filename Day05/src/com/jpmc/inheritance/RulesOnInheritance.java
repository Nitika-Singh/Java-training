package com.jpmc.inheritance;

public class RulesOnInheritance {
    public static void main(String[] args) {

    }
}

class Man {
    public final void eat() {}
}
class Superman extends Man {
    //public void eat() {}
}

final class Person {}
//class Superman extends Person {}
//class MyString extends String {}