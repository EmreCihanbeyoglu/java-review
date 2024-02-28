package org.sortingWithComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<StudentWithComparable> studentList = new ArrayList<>();
        studentList.add(new StudentWithComparable("Emre", "Cihan", 5, 24));
        studentList.add(new StudentWithComparable("Ali", "Cihan", 4, 22));
        studentList.add(new StudentWithComparable("Mehtmet", "Cihan", 3, 21));
        studentList.add(new StudentWithComparable("Yusuf", "Cihan", 6, 23));
        studentList.add(new StudentWithComparable("Sumeyye", "Cihan", 5, 20));
        studentList.add(new StudentWithComparable("Akif", "Cihan", 4, 19));

        System.out.println("before sorting: " + studentList.toString());
        Collections.sort(studentList, Collections.reverseOrder());
        System.out.println("after sorting: " + studentList.toString());



    }
}
