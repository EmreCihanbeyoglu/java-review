package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(4,5,3,9);
        int sum = myList.stream()
                .reduce(0, (a,b) -> a + b);
        System.out.println(sum);

        Optional<Integer> optionalSum = myList.stream()
                .reduce((a,b) -> a + b);
        optionalSum.ifPresent(x -> System.out.println(x));

        System.out.println("find min value");
        Optional<Integer> minOptional = myList.stream()
                .reduce(Integer::min);
       minOptional.ifPresent(System.out::println);

        System.out.println("find max value");
        Optional<Integer> maxOptional = myList.stream()
                .reduce(Integer::max);
        maxOptional.ifPresent(System.out::println);

        System.out.println("print count of the elements");
        int count = myList.stream()
                .map(x -> 1)
                .reduce(0, Integer::sum);
        System.out.println(count);
    }
}
