package org.example;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        // filter operations
        List<Integer> myList = Arrays.asList(1,2,3,4,5,5);
        myList.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);


        // filter unique ones
        myList.stream()
                .distinct()
                .forEach(System.out::println);

        // max treshold about the count of elements to be delivered to the next command
        myList.stream()
                .limit(3)
                .forEach(System.out::println);

        // skip
        myList.stream()
                .skip(2)
                .forEach(System.out::println);

        // map
        System.out.println("map");
        myList.stream()
                .map(i -> i * i)
                .forEach(System.out::println);


        // print the number of chars in each word
        System.out.println("task 1");
        List<String> myWordList = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        myWordList.stream()
                .map(String::length)
                .forEach(System.out::println);


        //flatMap ->   in its own folder

        //
    }
}
