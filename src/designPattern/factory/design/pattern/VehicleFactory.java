package designPattern.factory.design.pattern;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null)
            return null;
        return switch (vehicleType.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "truck" -> new Truck();
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        };


    }
}
