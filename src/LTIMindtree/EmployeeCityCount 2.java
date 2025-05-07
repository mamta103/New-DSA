package LTIMindtree;

import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static utililty.EmployeeUtil.getEmployees;

public class EmployeeCityCount {

    public static void main(String[] args) {
        List<Employee> list = getEmployees();
       Map<String, Long> mapResult = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(mapResult);
Comparator<Employee> employeeComparator = (a,b)-> a.getCity().compareTo(b.getCity());
        System.out.println("employeeComparator: "+ employeeComparator.toString());
    }
}
