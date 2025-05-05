package java8.groupinhBy;

import utililty.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static utililty.EmployeeUtil.getEmployees;

public class EmployeeToMap {
    public static void main(String[] args) {
        List<Employee> employeeList = getEmployees();
        Map<Integer, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getId));
        for(Map.Entry<Integer, List<Employee>> integerEmployeeEntry: map.entrySet()){
            System.out.println(integerEmployeeEntry);
        }
    }
}
