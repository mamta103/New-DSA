//package java8;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Sample {
//
//    public static void main(String[] args) {
//        // Creating sample Employee records
//        Employee emp1 = new Employee(101, "Bob Smith", "HR", 68000.75, "bob.smith@example.com");
//        Employee emp2 = new Employee(102, "Alice Brown", "HR", 67000.25, "alice.brown@example.com"); // Lower salary
//        Employee emp3 = new Employee(103, "Charlie Brown", "IT", 85000.00, "charlie.brown@example.com"); // Highest salary
//        Employee emp4 = new Employee(104, "David Lee", "Marketing", 72000.25, "david.lee@example.com");
//        Employee emp5 = new Employee(105, "Eva Adams", "Operations", 79000.60, "eva.adams@example.com");
//
//        // Creating list of employees
//        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
//
//        // Finding Employee with Maximum Salary
//       @NotNull DoubleSummaryStatistics minSalaryEmployee =  employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println(minSalaryEmployee);
//    }
//}
//package java8;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Sample {
//
//    public static void main(String[] args) {
//        // Creating sample Employee records
//        Employee emp1 = new Employee(101, "Bob Smith", "HR", 68000.75, "bob.smith@example.com");
//        Employee emp2 = new Employee(102, "Alice Brown", "HR", 67000.25, "alice.brown@example.com"); // Lower salary
//        Employee emp3 = new Employee(103, "Charlie Brown", "IT", 85000.00, "charlie.brown@example.com"); // Highest salary
//        Employee emp4 = new Employee(104, "David Lee", "Marketing", 72000.25, "david.lee@example.com");
//        Employee emp5 = new Employee(105, "Eva Adams", "Operations", 79000.60, "eva.adams@example.com");
//
//        // Creating list of employees
//        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
//
//        // Finding Employee with Maximum Salary
//       @NotNull DoubleSummaryStatistics minSalaryEmployee =  employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println(minSalaryEmployee);
//    }
//}
