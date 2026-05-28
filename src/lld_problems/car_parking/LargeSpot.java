package lld_problems.car_parking;

public class LargeSpot extends ParkingSpot{

    public LargeSpot(String spotId, int floor) {
        super(spotId, floor, SpotType.LARGE);
    }

    @Override
    public boolean canFit(VehicleType t) {
        return true; //allowing the vehicles
    }
}
