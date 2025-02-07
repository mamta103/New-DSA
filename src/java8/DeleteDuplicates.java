package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeleteDuplicates {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "alice.smith@example.com", 75000, "Finance", "Smith", "Alice"));
        employees.add(new Employee(102, "bob.johnson@example.com", 68000, "HR", "Johnson", "Bob"));
        employees.add(new Employee(103, "charlie.brown@example.com", 85000, "IT", "Brown", "Charlie"));
        employees.add(new Employee(104, "david.lee@example.com", 72000, "Marketing", "Lee", "David"));
        employees.add(new Employee(105, "eva.adams@example.com", 79000, "Operations", "Adams", "Eva"));

        // Printing employee details
        employees.forEach(System.out::println);
       List<Employee> result =  employees.stream().sorted(Comparator.comparing(Employee::getLastName)).toList();
        System.out.println(result);
    }
}
