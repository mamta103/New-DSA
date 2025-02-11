package designPattern.prototype;

// Client Code
public class PrototypeExample {
    public static void main(String[] args) {
        EmployeeRegistry employeeRegistry = new EmployeeRegistry();

        // Cloning employee prototype
        Employee dev1 = employeeRegistry.getEmployeeClone("developer");
        dev1.setName("Mamta");


        Employee manager1 = employeeRegistry.getEmployeeClone("manager");
        manager1.setName("Ankur");

        System.out.println(dev1);
        System.out.println(manager1);
    }
}
