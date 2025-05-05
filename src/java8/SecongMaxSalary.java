package java8;

import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static utililty.EmployeeUtil.getEmployees;


public class SecongMaxSalary {
    public static void main(String[] args) {

        List<Employee> employeeUtils = getEmployees();
        List<Employee> resultList = employeeUtils
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1).limit(1)
                .toList();
        for (Employee employee : resultList) {
            System.out.println(employee);
        }
    }
}
