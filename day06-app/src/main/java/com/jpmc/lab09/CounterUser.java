package com.jpmc.lab09;

import java.util.Scanner;

public class CounterUser {
    public static void main(String[] args) {
        Counter counterObj = new Counter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' to create a new Counter object, 'i' to increment, 'd' to Decrement, 'c' for object count, 'q' to quit.");
        String input = "";
        while(!"q".equals(input)) {
            input = scanner.next().trim();
            try {
                switch (input) {
                    case "del":
                        System.out.println("Deleting unreferenced objects");
                        System.gc(); //NOT RECOMMENDED AT ALL, because gc makes the application unresponsive for sometime
                        break;
                    case "n":
                        counterObj = new Counter();
                        System.out.println("Counter object created");
                        break;
                    case "i":
                        counterObj.increment();
                        System.out.println("Counter value: " + counterObj.getValue());
                        break;
                    case "d":
                        counterObj.decrement();
                        System.out.println("Counter value: " + counterObj.getValue());
                        break;
                    case "c":
                        System.out.println("Object count: " + Counter.getNumberOfObjects());
                        break;
                    case "q":
                        System.out.println("Bye Bye");
                        System.exit(0);
                    default:
                        throw new RuntimeException("Invalid Input");
                }
            }
            catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
