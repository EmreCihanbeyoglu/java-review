package org.sortingWithComparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentWithComparable implements Comparable<StudentWithComparable>{
    private String firstName;
    private String lastName;
    private int grade;
    private int age;


    @Override
    public int compareTo(StudentWithComparable o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithComparable that = (StudentWithComparable) o;
        return grade == that.grade && age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, grade, age);
    }
}
