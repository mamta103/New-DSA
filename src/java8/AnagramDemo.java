package java8;
import org.jetbrains.annotations.NotNull;
import utililty.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramDemo {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "Sharma", "IT", 75000.00, "amit.sharma@example.com", "Bangalore"),
                new Employee(2, "Priya", "Verma", "Finance", 85000.00, "priya.verma@example.com", "Mumbai"),
                new Employee(3, "Rahul", "Patel", "HR", 65000.00, "rahul.patel@example.com", "Delhi"),
                new Employee(4, "Sneha", "Reddy", "Marketing", 70000.00, "sneha.reddy@example.com", "Hyderabad"),
                new Employee(5, "Vikram", "Singh", "Engineering", 95000.00, "vikram.singh@example.com", "Chennai")
        );

       Optional<Employee> min =  employees.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("min:: "+min);
        // Finding Employee with Maximum Salary
       @NotNull DoubleSummaryStatistics minSalaryEmployee =  employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(minSalaryEmployee);

       List<Employee> sortedList =  employees.stream()
               .sorted(Comparator.comparing(Employee::getDepartment).reversed())
               .toList();
        System.out.println(sortedList);
    }
}
