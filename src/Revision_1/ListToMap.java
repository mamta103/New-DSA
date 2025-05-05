package Revision_1;

import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getEmployees();
        Map<Integer, Employee> resultMap = employees.stream().collect(Collectors.toMap(e->e.getId(), e->e));
        System.out.println(resultMap);
    }
}
