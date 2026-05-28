package lld_problems.car_parking;

public class HandicappedSpot extends ParkingSpot{

    public HandicappedSpot(String spotId, int floor) {
        super(spotId, floor, SpotType.HANDICAPPED);
    }

    @Override
    public boolean canFit(VehicleType t) {
        return t == VehicleType.CAR;
    }
}
