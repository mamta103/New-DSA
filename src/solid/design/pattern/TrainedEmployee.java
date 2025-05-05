package solid.design.pattern;

public class TrainedEmployee extends Employee{
    private String workMode;

    public TrainedEmployee(String name, int age, String workMode) {
        super(name, age);
        this.workMode = workMode;
    }
}
