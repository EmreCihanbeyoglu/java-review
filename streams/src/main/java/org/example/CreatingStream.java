package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        // from arrays
        String[] courseArray = {"Java", "C#", "Algorithms"};
        Stream<String> courseStreamFromArray = Arrays.stream(courseArray);


        // from collections
        List<String> courseList = Arrays.asList("Java", "C#", "Algorithms");
        Stream<String> courseStreamFromList = courseList.stream();


        List<Course> courseObjectList = Arrays.asList(
                new Course("Java", 101),
                new Course("Algorithms", 102),
                new Course("Coding", 100)
        );
        Stream<Course> courseObjectStream = courseObjectList.stream();


        // creating from values
        Stream<Integer> streamFromValues = Stream.of(1,2,3,4);

    }
}
