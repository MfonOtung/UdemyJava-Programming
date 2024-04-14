package org.mfon.section13_NestedClasses_And_Types.StaticNestedClasses;

import java.util.Comparator;

public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
