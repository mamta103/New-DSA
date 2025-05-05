package java100codes;

import diamondProlem.M;
import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
       String s = "Hello WorldWorld";
       String[]str = s.trim().split("\\s+");
        System.out.println(str[str.length-1].length());


        List<Employee> employees = EmployeeUtil.getEmployees();
      Map<String , Set<Employee>> result=  employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, TreeMap::new,Collectors.toSet()
        ));

        System.out.println( result.entrySet().stream().toList());;
    }

}
// Orginal Input String :[H, a, n, n, a, h]
//Output Input String :[h, a, n, n, a, H]