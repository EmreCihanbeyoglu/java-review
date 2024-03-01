package org.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairExample {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        List<int[]> pairedArray = numbers1.stream()
                .flatMap(number1 -> numbers2.stream().map(number2 -> new int[]{number1, number2}))
                .collect(Collectors.toList());

        pairedArray.stream()
                .map(Arrays::toString)
                .forEach(System.out::println);
    }
}
