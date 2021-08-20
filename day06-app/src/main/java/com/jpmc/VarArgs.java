package com.jpmc;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, 30, 40, 50, 60));
    }

    public static int add(int ... numbers) { //ellipsis, or varargs
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
