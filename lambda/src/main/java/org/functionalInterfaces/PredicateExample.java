package org.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> lesserThan = x -> x < 18;
        System.out.println(lesserThan.test(35));
    }
}
