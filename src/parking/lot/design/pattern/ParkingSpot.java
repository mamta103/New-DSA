package parking.lot.design.pattern;

public class ParkingSpot {
    private ParkingSpotType parkingSpotType;
    private Vehicle vehicle;
    private boolean isParkingSpotAvailble;

    public ParkingSpot(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isParkingSpotAvailble() {
        return isParkingSpotAvailble;
    }

    public void setParkingSpotAvailble(boolean parkingSpotAvailble) {
        isParkingSpotAvailble = parkingSpotAvailble;
    }
}
