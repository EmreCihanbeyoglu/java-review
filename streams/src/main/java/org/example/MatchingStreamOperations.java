package org.example;

import org.caloryTask.Dish;
import org.caloryTask.Type;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingStreamOperations {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("fruit", true, 800, Type.OTHER),
                new Dish("pizza", true, 800, Type.OTHER),
                new Dish("prawns", false, 800, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );
        // allMatch
        System.out.println("all dishes have calory less than 1000");
        boolean matchResult = menu.stream()
                                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(matchResult);

        // any match
        System.out.println("if any of them is vegeterian");
        boolean anyOfThemVegeterian = menu.stream()
                                        .anyMatch(Dish::isVegeterian);
        System.out.println(anyOfThemVegeterian);

        // none match
        System.out.println("none of them is matching");
        boolean noneOfThem = menu.stream()
                .noneMatch(dish -> dish.getCalories() > 1000);
        System.out.println(noneOfThem);

        // find any
        System.out.println("find if there exists any");
        Optional<Dish> foundOne = menu.stream()
                .filter(Dish::isVegeterian)
                .findAny();
        foundOne.ifPresent(dish -> System.out.println(dish.getName()));


        // find first
        System.out.println("find first there exists any");
        Optional<Dish> foundFirst = menu.stream()
                .filter(Dish::isVegeterian)
                .findFirst();
        foundFirst.ifPresent(dish -> System.out.println(dish.getName()));

    }
}
