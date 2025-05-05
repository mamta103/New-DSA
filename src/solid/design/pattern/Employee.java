package solid.design.pattern;

public class Employee {
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printEmployee(){
        System.out.println("Employee Main");
    }
}
