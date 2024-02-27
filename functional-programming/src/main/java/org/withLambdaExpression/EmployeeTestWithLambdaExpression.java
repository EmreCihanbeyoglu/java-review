package org.withLambdaExpression;

import org.employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTestWithLambdaExpression {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Emre", "US", 34));
        empList.add(new Employee("Ali", "AL", 51));
        empList.add(new Employee("Mehmet", "TR", 49));
        empList.add(new Employee("Yusuf", "NO", 13));

        System.out.println("whole list: \n" + empList.toString());

        List<Employee> oldEmployeeList = filterEmp(empList, emp -> emp.getAge() >= 50);
        List<Employee> usEmployeeList = filterEmp(empList, emp -> emp.getCountry().equals("US"));

        System.out.println("old employee list: \n" + oldEmployeeList.toString());
        System.out.println("us employee list: \n" + usEmployeeList.toString());


    }

    public static List<Employee> filterEmp(List<Employee> empList, Predicate<Employee> predicate) {
        List<Employee> filteredList = new ArrayList<>();
        for(Employee emp : empList) {
            if(predicate.test(emp)) {
                filteredList.add(emp);
            }
        }
        return filteredList;
    }



}
