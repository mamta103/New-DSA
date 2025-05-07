package java7;

import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxJavaEight {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 1, 7, 2, 3, 8);
        Optional<Integer> maxResult = numbers.stream().max(Integer::compareTo);
        System.out.println(maxResult.get());

        Optional<Integer> minResult = numbers.stream().min(Integer::compareTo);
        System.out.println(minResult.get());

        List<Employee> employees = EmployeeUtil.getEmployees();
        Optional<Employee> maxEmpSalary = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxEmpSalary.get().getFirstName() + " : " + maxEmpSalary.get().getSalary());

        Optional<Employee> minEmployeesalary = employees.stream().min(Comparator.comparing(Employee::getSalary));

        System.out.println(minEmployeesalary.get().getFirstName() + " : " + minEmployeesalary.get().getSalary());

       Map<Integer, List<Employee>> map =  employees.stream().collect(Collectors.groupingBy(Employee::getId));
       for(Map.Entry<Integer, List<Employee>> entry: map.entrySet()){
           System.out.println(entry.getKey()+ ": "+entry.getValue());



       }
        System.out.println(employees.stream().
                sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get());;




    }


}
