package lld_problems.car_parking;

public class CompactSpot extends ParkingSpot{

    public CompactSpot(String id, int floor) {
        super(id, floor, SpotType.COMPACT);
    }

    @Override
    public boolean canFit(VehicleType t) {
        return t == VehicleType.MOTORCYCLE || t == VehicleType.CAR;
    }
}
