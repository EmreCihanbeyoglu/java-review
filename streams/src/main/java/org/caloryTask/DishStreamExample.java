package org.caloryTask;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishStreamExample {
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

        menu.stream()
                .filter(dish -> dish.getCalories() < 700)
                .forEach(dish -> System.out.println(dish.getName()));

        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        // print 3 high calroci dish name (<300)
        System.out.println("3 high calory dish names");
        menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        // print all dish names that are below 400 calories in sorted
        System.out.println("print all dish names that are below 400 calories in sorted");
        menu.stream()
                .filter(dish -> dish.getCalories() < 500)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
