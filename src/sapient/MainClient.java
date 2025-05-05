package sapient;

abstract class Vehicle{
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle{
    void drive() {
        System.out.println("Car is driving...");
    }
}
public class MainClient {
//    Vehicle vehicle = new Vehicle();
    Car c = new Car();
//    c.drive();
//    c.start();
}
