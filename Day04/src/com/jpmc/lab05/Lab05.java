package com.jpmc.lab05;

public class Lab05 {
    public static void main(String[] args) {
        //int i = -1;
        String input = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8";
        String[] inputArr = input.split(" ");
        int sum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            String numInStr = inputArr[i];
            int num = Integer.parseInt(numInStr);
            sum += num;
        }
        System.out.println("Sum: " + sum);

    }
}
