package diamondProlem;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

interface Machine {
    default void start() {
        System.out.println("Machine is starting...");
    }
}

// Car implements both Vehicle and Machine
class Car implements Vehicle, Machine {

    @Override
    public void start() {
        System.out.println("Car is starting...");
        Vehicle.super.start();// Explicitly calling Vehicle's start method
        Machine.super.start();// Explicitly calling Machine's start method
    }
}

public class DiamondProblemRealWorld {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
