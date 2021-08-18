package com.jpmc;

public class Wrapper {
    public static void main(String[] args) {
        int i = 10;
        HeapItem obj = new HeapItem(10);

        boolean b = false;
        //Wrapper classes
        Integer intObj = 10;
        Boolean boolObj = true;
        Character chObj = 'A';
        Long longObj = 123L;
        Float floatObj = 12.3f;
        Double doubleObj = 12.4;

        System.out.println(intObj.intValue());
        System.out.println(boolObj.booleanValue());
        System.out.println(longObj.longValue());
        System.out.println(chObj.charValue());

    }
}

class HeapItem {
    private int num;

    public HeapItem(int num) {
        this.num = num;
    }
}