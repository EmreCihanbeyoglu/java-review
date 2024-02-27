package org.example;

public class StudentWithoutLombok {

    private String name;
    private String surname;
    private String email;
    private String studentID;
    private String hometown;
    private String department;
    private int age;

    public StudentWithoutLombok() {
    }

    public StudentWithoutLombok(String name, String surname, String email, String studentID, String hometown, String department, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.studentID = studentID;
        this.hometown = hometown;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", studentID='" + studentID + '\'' +
                ", hometown='" + hometown + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
