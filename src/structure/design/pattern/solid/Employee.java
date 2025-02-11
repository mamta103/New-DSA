package structure.design.pattern.solid;

public class Employee {
    private int id;
    private String name;
    //Noe Employee can use  address class
    private Address address;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printMe() {
        System.out.println("Employee ID is: " + id +
                "Employee Name is " + name

        );
    }

//    private String first line of address
//    private String second line of address
//    private String  city
//    private String state
}


