package java8;

import utililty.Employee;

import java.util.*;

public class DeleteDuplicates {
    public static void main(String[] args) {

        // Create a list of Employee objects
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "Sharma", "IT", 75000.00, "amit.sharma@example.com", "Bangalore"),
                new Employee(2, "Priya", "Verma", "Finance", 85000.00, "priya.verma@example.com", "Mumbai"),
                new Employee(3, "Rahul", "Patel", "HR", 65000.00, "rahul.patel@example.com", "Delhi"),
                new Employee(4, "Sneha", "Reddy", "Marketing", 70000.00, "sneha.reddy@example.com", "Hyderabad"),
                new Employee(5, "Vikram", "Singh", "Engineering", 95000.00, "vikram.singh@example.com", "Chennai")
        );

        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).distinct().forEach(System.out::println);
        //Find-Second-Max-Salary
        System.out.println("++++++++++++++Get Find-Second-Max-Salary: ++++++++++++++");
        List<Employee> value = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).distinct().skip(1).limit(1).toList();
        System.out.println(value);
    }
}
