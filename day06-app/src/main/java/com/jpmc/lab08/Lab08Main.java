package com.jpmc.lab08;

import java.util.*;

public class Lab08Main {
    static List<String> colors;

    public static void main(String[] args) {
        colors = createColorsList();
        createListOf5UniqueColors();
        createListOf5ColorsWithOneDuplication();
        createListOf5ColorsWithDuplication();
    }

    private static void createListOf5ColorsWithDuplication() {
        List<String> colorsWithDuplication = new ArrayList<>();
        while(colorsWithDuplication.size() < 5) {
            int randNumber = (int)(Math.random() * colors.size());
            String color = colors.get(randNumber);
            colorsWithDuplication.add(color);
        }
        System.out.println("***5 colors with any number of duplications");
        System.out.println(colorsWithDuplication);
    }

    private static void createListOf5ColorsWithOneDuplication() {
        Map<String, Integer> colorCountMap = new HashMap();
        boolean done = false;
        while(!done) {
            int randNumber = (int)(Math.random() * colors.size());
            String color = colors.get(randNumber);
            if(colorCountMap.containsKey(color)) {
                colorCountMap.put(color, 1);
            } else {
                boolean colorOccurringTwicePresent = false;
                for(int count : colorCountMap.values()) {
                    if(count == 2){
                        colorOccurringTwicePresent = true;
                        break;
                    }
                }
                if(!colorOccurringTwicePresent) {
                    colorCountMap.put(color, 2);
                }
            }
            int sum = 0;
            for(int count : colorCountMap.values()) {
                sum += count;
            }
            done = sum == 5 ? true : false;
        }
        System.out.println("***5 colors with ONE duplication");
        List<String> targetList = new ArrayList<>();
        for(String color : colorCountMap.keySet()) {
            if(colorCountMap.get(color) == 2) {
                targetList.add(color);
            }
            targetList.add(color);
        }
        System.out.println(targetList);

    }

    private static void createListOf5UniqueColors() {
        Set<String> uniqueColors = new HashSet<>();
        while(uniqueColors.size() < 5) {
            int randNumber = (int)(Math.random() * colors.size());
            String color = colors.get(randNumber);
            uniqueColors.add(color);
        }
        System.out.println("***5 unique colors");
        System.out.println(uniqueColors);
    }

    static List<String> createColorsList() {
        List<String> colors = Arrays.asList("red", "blue", "green", "yellow", "pink", "white", "black", "purple", "brown");
        return colors;
    }

    static List<String> createColorsListVerbose() {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("pink");
        colors.add("white");
        colors.add("black");
        colors.add("purple");
        colors.add("brown");
        return colors;
    }
}
