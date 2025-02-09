//package java8;
//
//import org.jetbrains.annotations.NotNull;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class EmployeeMapKeyIdValueAsObject {
//    public static void main(String[] args) {
//
//        String[] names = {"Sunil", "Vasu", "Shivu", "Sonu", "Priya", "Olivia", "Sunil"};
//        String department = "Sunil Yadav Vasu Shivu Sunil Yadav";
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(101, "alice.smith@example.com", 75000, "Finance", "Smith", "Alice"));
//        employees.add(new Employee(102, "bob.johnson@example.com", 68000, "HR", "Johnson", "Bob"));
//        employees.add(new Employee(103, "charlie.brown@example.com", 85000, "IT", "Brown", "Charlie"));
//        employees.add(new Employee(104, "david.lee@example.com", 72000, "Marketing", "Lee", "David"));
//        employees.add(new Employee(105, "eva.adams@example.com", 79000, "Operations", "Adams", "Eva"));
//        employees.add(new Employee(106, "eva.adams@example.com", 79000, "Operations", "Adams", "Eva"));
//
//
//        Map<Integer, Employee> result = employees.stream().collect(Collectors.toMap(e -> e.getId(), e -> e));
//        System.out.println(result);
//
//        @NotNull Map<String, Long> resultMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println(resultMap);
//
//        Map<String, Long> nameResult = Arrays.stream(names).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//        System.out.println("nameResult : " + nameResult);
//        System.out.println("++++++++++++++++");
//        System.out.println(department.toCharArray());
//
//
//
//    }
//}
