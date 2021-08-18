package com.jpmc;

import java.util.*;

public class CollectionsInJava {
    public static void main(String[] args) {
        //java.util
        //List, Set and Map

        System.out.println("*****List*****");
        List<String> cities = new ArrayList<>();
        cities.add("Chennai");
        cities.add("Pune");
        cities.add("Bangalore");
        cities.add("Chennai");
        System.out.println(cities.size());
        for(String city : cities) {
            System.out.println(city);
        }

        System.out.println("*****Set (does not allow duplicates)*****");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        System.out.println(numbers.size());
        for(int num : numbers) {
            System.out.println(num);
        }

        System.out.println("*****Map (key-value pair)");
        Map<Integer, String> romanNumbers = new HashMap<>();
        romanNumbers.put(1, "I");
        romanNumbers.put(2, "II");
        romanNumbers.put(3, "III");
        System.out.println(romanNumbers.size());
        for (int key: romanNumbers.keySet()) {
            System.out.println(key + ": " + romanNumbers.get(key));
        }

        //For C++ geeks
        //NOT PREFERRED IN THE MODERN DAYS OF PROGRAMMING
        String[][] romanNumerals = new String[3][];
        romanNumerals[0][0] = "I";
        romanNumerals[1][0] = "II";
        romanNumerals[2][0] = "III";

        Map<String, List<City>> countryCityMap = new HashMap<>();
        List<City> citiesInIndia = new ArrayList<>();
        citiesInIndia.add(new City("Chennai"));
        citiesInIndia.add(new City("Pune"));

        countryCityMap.put("India", citiesInIndia);

        List<City> citiesInUS = new ArrayList<>();
        citiesInUS.add(new City("Houston"));
        citiesInUS.add(new City("Boston"));

        countryCityMap.put("US", citiesInUS);

        Map<String, Account> accounts;
    }
}
class Account {}

class City {
    String name;
    public City(String name) {
        this.name = name;
    };
}