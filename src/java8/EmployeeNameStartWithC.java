package java8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNameStartWithC {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(101, "John", "Doe", "Engineering", 75000.0, "john.doe@example.com");
        Employee emp2 = new Employee(102, "Jane", "Smith", "HR", 65000.0, "jane.smith@example.com");
        Employee emp3 = new Employee(103, "Alice", "Johnson", "Marketing", 70000.0, "alice.johnson@example.com");
        Employee emp4 = new Employee(104, "Bob", "Brown", "Finance", 80000.0, "bob.brown@example.com");
        Employee emp5 = new Employee(105, "Charlie", "Davis", "Sales", 60000.0, "charlie.davis@example.com");
        // Filter employees whose first name starts with 'C'
        List<Employee> listEmployeeNameStartWithC = employees.stream()
                                                             .filter(e -> e.getFirstName().toLowerCase().startsWith("c"))
                                                             .toList();

        // Print the filtered list of employees
        System.out.println("listEmployeeNameStartWithC :: " + listEmployeeNameStartWithC);
    }
}
