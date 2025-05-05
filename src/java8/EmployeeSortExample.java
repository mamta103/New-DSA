package java8;



import utililty.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSortExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "Sharma", "IT", 75000.00, "amit.sharma@example.com", "Bangalore"),
                new Employee(2, "Priya", "Verma", "Finance", 85000.00, "priya.verma@example.com", "Mumbai"),
                new Employee(3, "Rahul", "Patel", "HR", 65000.00, "rahul.patel@example.com", "Delhi"),
                new Employee(4, "Sneha", "Reddy", "Marketing", 70000.00, "sneha.reddy@example.com", "Hyderabad"),
                new Employee(5, "Vikram", "Singh", "Engineering", 95000.00, "vikram.singh@example.com", "Chennai")
        );

        List<Employee> result = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).toList();

        Employee e = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).toList().get(0);
        System.out.println(e);

        //Store Key as city and value as Employee Onject
        Map<String, List<Employee> > map = employees.stream().collect(Collectors.groupingBy(Employee::getCity));
    }
}