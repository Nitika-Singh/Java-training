package com.jpmc;

public class ExceptionHandlingStackWalk {
    public static void main(String[] args) {
        try {
            calculate();
        }
        catch(Exception ex) {
            System.out.println("Exception handled in main() " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("End of main");
    }

    static void calculate() {
        doSomethingCrazy();
//        try {
//            doSomethingCrazy();
//        }
//        catch(Exception ex) {
//            System.out.println("Exception handled in calculate() " + ex.getMessage());
//        }

    }

    static void doSomethingCrazy() {
        System.out.println("***In doSomethingCrazy");
        int num1 = 10;
        int num2 = 0;
        int ans = num1 / num2;
        System.out.println("Answer: " + ans);
    }
}
