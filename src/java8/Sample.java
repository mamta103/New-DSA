package java8;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John", "Doe", "Engineering", 75000.0, "john.doe@example.com");
        Employee emp2 = new Employee(102, "Jane", "Smith", "HR", 65000.0, "jane.smith@example.com");
        Employee emp3 = new Employee(103, "Alice", "Johnson", "Marketing", 70000.0, "alice.johnson@example.com");
        Employee emp4 = new Employee(104, "Bob", "Brown", "Finance", 80000.0, "bob.brown@example.com");
        Employee emp5 = new Employee(105, "Charlie", "Davis", "Sales", 60000.0, "charlie.davis@example.com");
        // Creating list of employees

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        // Finding Employee with Maximum Salary
       @NotNull DoubleSummaryStatistics minSalaryEmployee =  employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(minSalaryEmployee);

       List<Employee> sortedList =  employees.stream()
               .sorted(Comparator.comparing(Employee::getDepartment).reversed())
               .toList();
        System.out.println(sortedList);
    }
}
