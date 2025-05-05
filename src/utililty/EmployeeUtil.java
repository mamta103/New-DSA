package utililty;

import java.util.Arrays;
import java.util.List;

public class  EmployeeUtil {

    // Private constructor to prevent instantiation
    private EmployeeUtil() {
        throw new UnsupportedOperationException("Utility class - cannot be instantiated");
    }

    // Static method to return a list of employees
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Amit", "Sharma", "IT", 75000.00, "amit.sharma@example.com", "Bangalore"),
                new Employee(6, "Mamta", "Sharma", "IT", 75000.00, "mamta.sharma@example.com", "Bangalore"),

                new Employee(2, "Priya", "Verma", "Finance", 85000.00, "priya.verma@example.com", "Mumbai"),
                new Employee(3, "Rahul", "Patel", "HR", 65000.00, "rahul.patel@example.com", "Delhi"),
                new Employee(4, "Sneha", "Reddy", "Marketing", 70000.00, "sneha.reddy@example.com", "Hyderabad"),
                new Employee(5, "Vikram", "Singh", "Engineering", 95000.00, "vikram.singh@example.com", "Chennai")
        );
    }
}