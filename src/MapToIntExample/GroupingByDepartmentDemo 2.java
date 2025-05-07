package MapToIntExample;


import org.jetbrains.annotations.NotNull;
import utililty.Employee;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static utililty.EmployeeUtil.getEmployees;

public class GroupingByDepartmentDemo {
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();
 @NotNull Map<String,  Long> re =  employees.stream().map(e->e.getDepartment()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(re); }
}
