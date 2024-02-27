package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentWithLombok {

    private String name;
    private String surname;
    private String email;
    private String studentID;
    private String hometown;
    private String department;
    private int age;

}
