package java8;

import utililty.Employee;

import java.util.*;

public class PracticeFile {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "Sharma", "IT", 75000.00, "amit.sharma@example.com", "Bangalore"),
                new Employee(2, "Priya", "Verma", "Finance", 85000.00, "priya.verma@example.com", "Mumbai"),
                new Employee(3, "Rahul", "Patel", "HR", 65000.00, "rahul.patel@example.com", "Delhi"),
                new Employee(4, "Sneha", "Reddy", "Marketing", 70000.00, "sneha.reddy@example.com", "Hyderabad"),
                new Employee(5, "Vikram", "Singh", "Engineering", 95000.00, "vikram.singh@example.com", "Chennai")
        );

//        List<Employee> result =  employees.stream().distinct().collect(Collectors.toList());

//        Sort by Employee Department
//        List<Employee> sortedList =   employees.stream().sorted(Comparator.comparing(Employee::getDepartment)).toList();

//      DoubleSummaryStatistics result=  employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println(result);
//
//        List<Integer> numbers = Arrays.asList(5, 12, 9, 21, 18, 9, 12, 7);
//        Optional<Integer> min = numbers.stream().min(Comparator.comparing(i->i));
//        System.out.println("Min : "+min);
//       Optional<Integer> findFirst =  numbers.stream().filter(i-> i%2 ==0 ).sorted().limit(2).findFirst();
//        if(findFirst.isPresent()){
//            System.out.println(findFirst);
//        }
//
//       Optional<Integer> maxvalue = numbers.stream().max(Integer::compareTo);
//        System.out.println(maxvalue);
       Set<Employee> emp = new HashSet<>(employees);
       for(Employee e:emp){
           System.out.println(e.getFirstName());
       }

       Set<String> seenFirstNames = new HashSet<>();
       List<Employee> uniqueEmployees = new ArrayList<>();

       for (Employee e : employees) {
           if (seenFirstNames.add(e.getFirstName())) {
               uniqueEmployees.add(e);
           }
       }

       for (Employee e : uniqueEmployees) {
           System.out.println(e.getFirstName());
       }
    }
}
