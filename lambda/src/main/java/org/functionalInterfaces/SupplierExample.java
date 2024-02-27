package org.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> generateRandomNumber = () -> Math.random();
        System.out.println(generateRandomNumber.get());
    }
}
