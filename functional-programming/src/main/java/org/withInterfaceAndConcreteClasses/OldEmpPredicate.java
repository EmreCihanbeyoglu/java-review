package org.withInterfaceAndConcreteClasses;

import org.employee.Employee;

public class OldEmpPredicate implements EmployeePredicate{
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 50;
    }
}
