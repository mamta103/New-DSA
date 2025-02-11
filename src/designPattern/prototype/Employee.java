package designPattern.prototype;

// Concrete Prototype Class
public class Employee implements Prototype {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        return new Employee(name, designation);
    }

}
