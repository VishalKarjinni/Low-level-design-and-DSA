package lld_problems.car_parking;

abstract class ParkingSpot {
    private final String spotId;
    private final int floor;
    private final SpotType type;
    private boolean isFree;
    private Vehicle parkedVehicle;

    public ParkingSpot(String spotId, int floor, SpotType type) {
        this.spotId = spotId;
        this.floor = floor;
        this.type = type;
        this.isFree = true;
    }

    public abstract boolean canFit(VehicleType vehicleType);

    public synchronized boolean assignVehicle(Vehicle vehicle){
        if (!isFree && !canFit(vehicle.getVehicleType())) return false;
        parkedVehicle = vehicle;
        isFree = false;
        return true;
    }

    public synchronized void freeSpot() {
        parkedVehicle =  null;
        isFree = true;
    }

    public String getSpotId() {
        return spotId;
    }

    public int getFloor() {
        return floor;
    }

    public SpotType getType() {
        return type;
    }

    public boolean isFree() {
        return isFree;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId='" + spotId + '\'' +
                ", floor=" + floor +
                ", type=" + type +
                ", isFree=" + isFree +
                ", parkedVehicle=" + parkedVehicle +
                '}';
    }
}
