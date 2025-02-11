package designPattern.prototype;

import java.util.HashMap;
import java.util.Map;

// Prototype Registry (Maintains Predefined Objects)
public class EmployeeRegistry {
    private Map<String, Employee> employeeMap = new HashMap<>();

    public EmployeeRegistry(){
        employeeMap.put("developer", new Employee("Default Dev", "Software Developer"));
        employeeMap.put("manager", new Employee("Default Manager", "Project Manager"));
    }

    public Employee getEmployeeClone(String type){
        return (Employee) employeeMap.get(type).clone();
    }
}
