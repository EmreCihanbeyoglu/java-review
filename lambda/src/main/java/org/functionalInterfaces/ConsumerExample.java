package org.functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printColor = color -> System.out.println(color);
        printColor.accept("GREEN");

        BiConsumer<String, String> printFullName = (name, surname) -> System.out.println(name + " " + surname);
        printFullName.accept("Emre", "Cihanbeyoglu");
    }
}
