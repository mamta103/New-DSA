package midum_01;

import util.Employee;
import util.EmployeeUtil;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Employee> list = EmployeeUtil.getEmployees();
        List<Employee> result = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).toList();

        Set<Employee> set = new TreeSet<>(list);
        List<Employee> sorted = new ArrayList<>(set);
        System.out.println("Second highest: " + sorted.get(set.size()-2));

    }
}
//Second Highest:
//---------------
//ID         : 2
//First Name : Priya
//Last Name  : Verma
//Department : Finance
//Salary     : ₹85,000.00
//Email      : priya.verma@example.com
//City       : Mumbai
