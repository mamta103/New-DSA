package groupingBy;

import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyEmployeeIdValueEmployee {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getEmployees();
        Map<Integer, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getId));
        System.out.println(map);
    }
}
