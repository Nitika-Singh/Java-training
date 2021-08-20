package com.jpmc.lab08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SomeMoreOnCollections {
    public static void main(String[] args) {
        //Hashset doesn't preserve the order; allows null
        //Set<String> cities = new HashSet<>();

        //TreeSet sorts in ascending order; doesn't allow null
        Set<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Chennai");
        cities.add("Mumbai");
        //cities.add(null); //NPE
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
