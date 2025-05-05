package DefaultMethodOverride;

import diamondProlem.B;

interface Vehicle {
    // Default method with a standard implementation
    default void startEngine() {
        System.out.println("Starting the engine...");
    }
}

class Car implements Vehicle {
    // Optionally overriding the default method
    @Override
    public void startEngine() {
        System.out.println("Car engine is starting with a key...");
    }
}

class Bike implements Vehicle {

}

public class DefaultMethodOverrride {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();

        Vehicle bike = new Bike();
        bike.startEngine();
    }
}
