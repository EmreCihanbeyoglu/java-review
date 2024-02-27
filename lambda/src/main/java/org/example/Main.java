package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(24, Color.GREEN));
        appleList.add(new Apple(12, Color.RED));
        appleList.add(new Apple(36, Color.YELLOW));
        appleList.add(new Apple(20, Color.GREEN));
        appleList.add(new Apple(22, Color.YELLOW));

        printApples(appleList, apple -> System.out.println("A " + apple.getColor() + " apple"));
        printApples(appleList, apple -> System.out.println("An apple of " + apple.getWeight() + "g"));

    }

    public static void printApples(List<Apple> appleList, ApplePrinter ap) {
        for(Apple apple : appleList) {
            ap.prettyPrinter(apple);
        }
    }
}