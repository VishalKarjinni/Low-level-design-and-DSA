package lld_problems.car_parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpotList = new ArrayList<>();

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addSpot(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
    }

    public Optional<ParkingSpot> findAvailableSpots(VehicleType vehicleType) {
        return parkingSpotList.stream().filter(s -> s.isFree() && s.canFit(vehicleType)).findFirst();
    }

    public List<ParkingSpot> getAllSpots() {
        return Collections.unmodifiableList(parkingSpotList);
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
