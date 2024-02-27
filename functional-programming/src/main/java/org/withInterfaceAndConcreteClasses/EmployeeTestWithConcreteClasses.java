package org.withInterfaceAndConcreteClasses;

import org.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTestWithConcreteClasses {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Emre", "US", 34));
        empList.add(new Employee("Ali", "AL", 51));
        empList.add(new Employee("Mehmet", "TR", 49));
        empList.add(new Employee("Yusuf", "NO", 13));

        System.out.println("whole list: \n" + empList.toString());


        List<Employee> oldEmployeeList = filterEmp(empList, new OldEmpPredicate());
        List<Employee> usEmployeeList = filterEmp(empList, new USEmpPredicate());

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
