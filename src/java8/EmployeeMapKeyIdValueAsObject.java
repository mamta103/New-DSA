package java8;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMapKeyIdValueAsObject {
    public static void main(String[] args) {

        String[] names = {"Sunil", "Vasu", "Shivu", "Sonu", "Priya", "Olivia", "Sunil"};
        String department = "Sunil Yadav Vasu Shivu Sunil Yadav";

        Employee emp1 = new Employee(101, "John", "Doe", "Engineering", 75000.0, "john.doe@example.com");
        Employee emp2 = new Employee(102, "Jane", "Smith", "HR", 65000.0, "jane.smith@example.com");
        Employee emp3 = new Employee(103, "Alice", "Johnson", "Marketing", 70000.0, "alice.johnson@example.com");
        Employee emp4 = new Employee(104, "Bob", "Brown", "Finance", 80000.0, "bob.brown@example.com");
        Employee emp5 = new Employee(105, "Charlie", "Davis", "Sales", 60000.0, "charlie.davis@example.com");
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

      Map<Integer, Employee> mapResult=   employees.stream().collect(Collectors.toMap(Employee::getId, emp->emp));
        System.out.println("mapResult: "+mapResult);

        @NotNull Map<String, Long> resultMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(resultMap);

        Map<String, Long> nameResult = Arrays.stream(names).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("nameResult : " + nameResult);
        System.out.println(department.toCharArray());



    }
}
