package utililty;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Employee  implements Comparable<Employee>{
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    private String email;
    private String city;
    // Constructor


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee(int id, String firstName, String lastName, String department, double salary, String email, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.city = city;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ToString method for easy output


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return Integer.compare(this.id, o.id);
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(department);
    }
}
