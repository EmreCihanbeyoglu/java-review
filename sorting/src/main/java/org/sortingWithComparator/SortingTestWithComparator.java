package org.sortingWithComparator;

import org.sortingWithComparable.StudentWithComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTestWithComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sumeyye", "Cihan", 5, 24));
        studentList.add(new Student("Ali", "Cihan", 4, 22));
        studentList.add(new Student("Mehtmet", "Cihan", 3, 21));
        studentList.add(new Student("Yusuf", "Cihan", 6, 23));
        studentList.add(new Student("Emre", "Cihan", 5, 20));
        studentList.add(new Student("Akif", "Cihan", 4, 19));

        System.out.println("before sorting: " + studentList.toString());
        // studentList.sort((second, first) -> Integer.compare(first.getAge(), second.getAge()));
        studentList.sort(Comparator.comparing(Student::getGrade).thenComparing(Student::getAge).reversed());
        System.out.println("after sorting: " + studentList.toString());
    }
}
