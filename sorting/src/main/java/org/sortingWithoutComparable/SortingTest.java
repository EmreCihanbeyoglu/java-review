package org.sortingWithoutComparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {
        List<StudentWithoutComparable> studentList = new ArrayList<>();
        studentList.add(new StudentWithoutComparable("Emre", "Cihan", 5, 24));
        studentList.add(new StudentWithoutComparable("Ali", "Cihan", 4, 22));
        studentList.add(new StudentWithoutComparable("Mehtmet", "Cihan", 3, 21));
        studentList.add(new StudentWithoutComparable("Yusuf", "Cihan", 6, 23));
        studentList.add(new StudentWithoutComparable("Sumeyye", "Cihan", 5, 20));
        studentList.add(new StudentWithoutComparable("Akif", "Cihan", 4, 19));

        System.out.println("before sorting: " + studentList.toString());
       // Collections.sort(studentList); // no suitable method found - compilation error since it is not implementing Comparable interface
        Collections.sort(studentList, Collections.reverseOrder()); // casting error - compilation error since it is not implementing Comparable interface
        System.out.println("after sorting: " + studentList.toString());
    }
}
