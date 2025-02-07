package java8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNameStartWithC {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "alice.smith@example.com", 75000, "Finance", "Smith", "Alice"));
        employees.add(new Employee(102, "bob.johnson@example.com", 68000, "HR", "Johnson", "Bob"));
        employees.add(new Employee(103, "charlie.brown@example.com", 85000, "IT", "Brown", "Charlie"));
        employees.add(new Employee(104, "david.lee@example.com", 72000, "Marketing", "Lee", "David"));
        employees.add(new Employee(105, "eva.adams@example.com", 79000, "Operations", "Adams", "Eva"));

        // Filter employees whose first name starts with 'C'
        List<Employee> listEmployeeNameStartWithC = employees.stream()
                                                             .filter(e -> e.getFirstName().toLowerCase().startsWith("c"))
                                                             .toList();
        
        // Print the filtered list of employees
        System.out.println("listEmployeeNameStartWithC :: " + listEmployeeNameStartWithC);
    }
}
Output::listEmployeeNameStartWithC :: [Employee{id=103, firstName='Charlie', lastName='Brown', department='IT', salary=85000.0, email='charlie.brown@example.com'}]
