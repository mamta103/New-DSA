package midum_01;

import util.Employee;
import util.EmployeeUtil;

import java.util.Comparator;
import java.util.List;

//3️⃣ Sort an ArrayList of Custom Objects (Employee by Salary)
public class SortBySalary {
    public static void main(String[] args) {

        List<Employee> list = EmployeeUtil.getEmployees();
        List<Employee> sortBySalary = list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(sortBySalary);
    }
    //Employee List:
    //--------------
    //1. ID: 3
    //   Name: Rahul Patel
    //   Department: HR
    //   Salary: ₹65,000.0
    //   Email: rahul.patel@example.com
    //   City: Delhi
    //
    //2. ID: 4
    //   Name: Sneha Reddy
    //   Department: Marketing
    //   Salary: ₹70,000.0
    //   Email: sneha.reddy@example.com
    //   City: Hyderabad
    //
    //3. ID: 1
    //   Name: Amit Sharma
    //   Department: IT
    //   Salary: ₹75,000.0
    //   Email: amit.sharma@example.com
    //   City: Bangalore
    //
    //4. ID: 6
    //   Name: Mamta Sharma
    //   Department: IT
    //   Salary: ₹75,000.0
    //   Email: mamta.sharma@example.com
    //   City: Bangalore
    //
    //5. ID: 2
    //   Name: Priya Verma
    //   Department: Finance
    //   Salary: ₹85,000.0
    //   Email: priya.verma@example.com
    //   City: Mumbai
    //
    //6. ID: 5
    //   Name: Vikram Singh
    //   Department: Engineering
    //   Salary: ₹95,000.0
    //   Email: vikram.singh@example.com
    //   City: Chennai
}
