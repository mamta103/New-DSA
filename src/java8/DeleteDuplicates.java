package java8;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteDuplicates {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(101, "John", "Doe", "Engineering", 75000.0, "john.doe@example.com");
        Employee emp2 = new Employee(102, "Jane", "Smith", "HR", 65000.0, "jane.smith@example.com");
        Employee emp3 = new Employee(103, "Alice", "Johnson", "Marketing", 70000.0, "alice.johnson@example.com");
        Employee emp4 = new Employee(104, "Bob", "Brown", "Finance", 80000.0, "bob.brown@example.com");
        Employee emp5 = new Employee(105, "Charlie", "Davis", "Sales", 60000.0, "charlie.davis@example.com");

        // Print the details of each employee
        employees.forEach(System.out::println);

        // Sort the list of employees by their last name
        List<Employee> result = employees.stream()
                                         .sorted(Comparator.comparing(Employee::getLastName))
                                         .toList();

        // Print the sorted list of employees
        System.out.println(result);
    }
}
