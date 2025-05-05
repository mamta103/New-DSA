package Comparable;

import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getEmployees();
        System.out.println("Before Sorting:");
        Collections.sort(employees);
        System.out.println(employees);


        employees.sort(Comparator.comparing(e->e.getCity()));
        System.out.println("After Sorting by City:" +employees);
    }
}
