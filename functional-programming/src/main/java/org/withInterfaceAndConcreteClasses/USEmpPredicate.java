package org.withInterfaceAndConcreteClasses;

import org.employee.Employee;

public class USEmpPredicate implements EmployeePredicate{
    @Override
    public boolean test(Employee employee) {
        return employee.getCountry().equals("US");
    }
}
