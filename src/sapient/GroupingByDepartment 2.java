//package sapient;
//
//import utililty.Employee;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import static utililty.EmployeeUtil.getEmployees;
//
//public class GroupingByDepartment {
//    public static void main(String[] args) {
//        List<Employee> employees = getEmployees();
//        Map<String, List<Employee>> employeesByDept = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//
//        employeesByDept.forEach((dept, empList) -> {
//            System.out.println(dept + " -> " + empList.stream()
//                    .map(Employee::getFirstName)
//                    .collect(Collectors.toList()));
//        });
//
//
//    }
//}
