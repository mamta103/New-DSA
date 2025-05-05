package java8;

import utililty.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMapKeyIdValueAsObject {
    public static void main(String[] args) {

        String[] names = {"Sunil", "Vasu", "Shivu", "Sonu", "Priya", "Olivia", "Sunil"};
        String department = "Sunil Yadav Vasu Shivu Sunil Yadav";

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "Sharma", "IT", 75000.00, "amit.sharma@example.com", "Bangalore"),
                new Employee(2, "Priya", "Verma", "Finance", 85000.00, "priya.verma@example.com", "Mumbai"),
                new Employee(3, "Rahul", "Patel", "HR", 65000.00, "rahul.patel@example.com", "Delhi"),
                new Employee(4, "Sneha", "Reddy", "Marketing", 70000.00, "sneha.reddy@example.com", "Hyderabad"),
                new Employee(5, "Vikram", "Singh", "Engineering", 95000.00, "vikram.singh@example.com", "Chennai")
        );

        //Keeping Employeas a key and value as a Object
        Map<Integer, Employee> employeeMap = employees.stream().collect(Collectors.toMap(Employee::getId, e -> e));
        System.out.println("employeeMap :" + employeeMap);

        // Group employees by city using Java Streams
        Map<String, List<Employee>> emp = employees.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("emp :" + emp);

        Map<String, Long> nameResult = Arrays.stream(names).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("nameResult : " + nameResult);
        System.out.println(department.toCharArray());


    }
}
