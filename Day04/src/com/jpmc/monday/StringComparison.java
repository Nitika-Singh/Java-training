package com.jpmc.monday;

public class StringComparison {
    public static void main(String[] args) {
        String lang1 = "Java";
        String lang2 = new String("Java");

        if(lang1 == lang2) {
            System.out.println("lang1 and lang2 are the same");
        } else {
            System.out.println("lang1 and lang2 are different");
        }

        //== compares the references
        ///equals() compares the values
        if(lang1.equals(lang2)) {
            System.out.println("lang1 and lang2 are equal");
        }
        String city1 = "Pune";
        String city2 = "Pune";
        city1 = city2;
        city2 = "Mumbai";

//        if(city1 == city2) {
//            System.out.println("city1 and city2 are the same");
//        }
//        if(city1.equals(city2)) {
//            System.out.println("city1 and city2 are equal");
//        }

    }
}
