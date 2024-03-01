package org.flatMapExample;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("Emre", "mrcihan@gmail.com", Arrays.asList("11223344", "11113344")),
                new Employee("Ahmet", "ahmet@gmail.com", Arrays.asList("444223344", "444113344")),
                new Employee("Ali", "ali@gmail.com", Arrays.asList("555223344", "555113344"))
        );

        // print all emails
        System.out.println("print all emails");
        empList.stream()
                .map(Employee::getEmail)
                .forEach(System.out::println);

        System.out.println("print all phone numbers");
        empList.stream()
                .flatMap(emp -> emp.getPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("2nd way print all phone numbers");
        empList.stream()
                .map(Employee::getPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
