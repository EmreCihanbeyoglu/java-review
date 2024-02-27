package org.withInterfaceAndAnonymousClasses;

import org.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTestWithAnonymousClasses {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Emre", "US", 34));
        empList.add(new Employee("Ali", "AL", 51));
        empList.add(new Employee("Mehmet", "TR", 49));
        empList.add(new Employee("Yusuf", "NO", 13));

        System.out.println("whole list: \n" + empList.toString());

        List<Employee> oldEmployeeList = filterEmp(empList, new EmployeePredicate() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() >= 50;
            }
        });

        List<Employee> usEmployeeList = filterEmp(empList, new EmployeePredicate() {
            @Override
            public boolean test(Employee employee) {
                return employee.getCountry().equals("US");
            }
        });

        System.out.println("old employees: \n" + oldEmployeeList.toString());
        System.out.println("us employee list: \n" + usEmployeeList.toString());
    }

    public static List<Employee> filterEmp(List<Employee> empList, EmployeePredicate p) {
        List<Employee> filteredList = new ArrayList<>();
        for(Employee emp : empList) {
            if(p.test(emp)) {
                filteredList.add(emp);
            }
        }
        return filteredList;
    }
}
