package com.jpmc;

public class StaticObjectsExample {
    public static void main(String[] args) {
        JPMCEmployee sreedhar = new JPMCEmployee("Sreedhar");
        JPMCEmployee nikita = new JPMCEmployee("Nikita");
        sreedhar.workInOffice();
        nikita.workInOffice();
        sreedhar.workInOffice();
    }
}

class JPMCEmployee {
    private String name;
    private static VendingMachine vm = new VendingMachine();
    public JPMCEmployee(String name) {
        this.name = name;
    }
    public void workInOffice() {
        System.out.println("***Working");
        vm.drinkCoffee(50);
    }
}

class VendingMachine {
    private int quantity = 100;
    public void drinkCoffee(int qty) {
        if(quantity < qty) {
            throw new RuntimeException("Sorry no coffee! Please step out and have from a shop");
        } else {
            quantity -= qty;
        }
    }
}