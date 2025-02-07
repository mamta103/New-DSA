package java8;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteDuplicates {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "alice.smith@example.com", 75000, "Finance", "Smith", "Alice"));
        employees.add(new Employee(102, "bob.johnson@example.com", 68000, "HR", "Johnson", "Bob"));
        employees.add(new Employee(103, "charlie.brown@example.com", 85000, "IT", "Brown", "Charlie"));
        employees.add(new Employee(104, "david.lee@example.com", 72000, "Marketing", "Lee", "David"));
        employees.add(new Employee(105, "eva.adams@example.com", 79000, "Operations", "Adams", "Eva"));

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

Output:
Employee{id=101, firstName='Alice', lastName='Smith', department='Finance', salary=75000.0, email='alice.smith@example.com'}
Employee{id=102, firstName='Bob', lastName='Johnson', department='HR', salary=68000.0, email='bob.johnson@example.com'}
Employee{id=103, firstName='Charlie', lastName='Brown', department='IT', salary=85000.0, email='charlie.brown@example.com'}
Employee{id=104, firstName='David', lastName='Lee', department='Marketing', salary=72000.0, email='david.lee@example.com'}
Employee{id=105, firstName='Eva', lastName='Adams', department='Operations', salary=79000.0, email='eva.adams@example.com'}

[Employee{id=105, firstName='Eva', lastName='Adams', department='Operations', salary=79000.0, email='eva.adams@example.com'},
Employee{id=103, firstName='Charlie', lastName='Brown', department='IT', salary=85000.0, email='charlie.brown@example.com'},
Employee{id=102, firstName='Bob', lastName='Johnson', department='HR', salary=68000.0, email='bob.johnson@example.com'}, 
Employee{id=104, firstName='David', lastName='Lee', department='Marketing', salary=72000.0, email='david.lee@example.com'}, 
Employee{id=101, firstName='Alice', lastName='Smith', department='Finance', salary=75000.0, email='alice.smith@example.com'}]
