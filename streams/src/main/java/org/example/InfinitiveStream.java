package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InfinitiveStream {
    public static void main(String[] args) {
        Stream.iterate(0, a -> a + 2)
                .limit(3)
                .forEach(System.out::println);

        // fibonacci
        System.out.println("fibonacci series with 10 elements");

        Stream.iterate(new int[]{0,1}, n -> new int[] {n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);
    }
}
