package java100codes;

import utililty.Employee;
import utililty.EmployeeUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMaxSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getEmployees();
        Map<Employee, Long> re = employees.stream().collect(Collectors.groupingBy(
                name -> name, Collectors.counting()
        ));
        System.out.println("re: " + re);
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 2, 8, 3, 7, 1);
        Integer sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: " + sum);
        int su = numbers.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(su);
        OptionalInt r = numbers.stream().mapToInt(Integer::intValue).max();
        System.out.println(r);

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        List<Integer> result1 = Stream.concat(list1.stream(), list2.stream()).toList();
        System.out.println(result1);
        //Remove Duplicate from List
        List<Integer> unique = numbers.stream().distinct().sorted().toList();
        System.out.println(unique);

        Optional<Integer> secondmaxElement = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondmaxElement.get());

        OptionalDouble max = employees.stream().mapToDouble(Employee::getSalary).max();
        if (max.isPresent()) {
            System.out.println(max.getAsDouble());
        }

        Map<String, Long> result = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.counting()
        ));
        System.out.println(result);


    }

}//output 95000.0
