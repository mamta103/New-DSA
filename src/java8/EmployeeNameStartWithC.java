package java8;

import utililty.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeNameStartWithC {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "Sharma", "IT", 75000.00, "amit.sharma@example.com", "Bangalore"),
                new Employee(2, "Priya", "Verma", "Finance", 85000.00, "priya.verma@example.com", "Mumbai"),
                new Employee(3, "Rahul", "Patel", "HR", 65000.00, "rahul.patel@example.com", "Delhi"),
                new Employee(4, "Sneha", "Reddy", "Marketing", 70000.00, "sneha.reddy@example.com", "Hyderabad"),
                new Employee(5, "Vikram", "Singh", "Engineering", 95000.00, "vikram.singh@example.com", "Chennai")
        );

        // Filter employees whose first name starts with 'C'
        List<Employee> listEmployeeNameStartWithC = employees.stream()
                                                             .filter(e -> e.getFirstName().toLowerCase().startsWith("c"))
                                                             .toList();

        // Print the filtered list of employees
        System.out.println("listEmployeeNameStartWithC :: " + listEmployeeNameStartWithC);
    }
}
