package org.sortingWithoutComparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentWithoutComparable {
    private String firstName;
    private String lastName;
    private int grade;
    private int age;
}
