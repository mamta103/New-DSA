package designPattern.factory.design.pattern;

public class FactoryPatternExample {
    public static void main(String[] args) {

        // Create a car using the factory
        Vehicle car = VehicleFactory.createVehicle("car");
        car.manufacture();

        // Create a bike using the factory
        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.manufacture();

        // Create a truck using the factory
        Vehicle truck = new Truck();
        truck.manufacture();

        //Invalid Car
        Vehicle auto = VehicleFactory.createVehicle("auto");
        auto.manufacture();

    }
}
