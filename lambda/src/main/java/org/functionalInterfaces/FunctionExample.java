package org.functionalInterfaces;


import java.util.function.Function;


public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(3));
    }
}
