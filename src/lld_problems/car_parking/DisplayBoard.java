package lld_problems.car_parking;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
    private final Map<SpotType, Integer> freeSpots = new EnumMap<>(SpotType.class);

    public void update(List<ParkingSpot> allSpots) {
        freeSpots.clear();
        for (ParkingSpot s : allSpots) {
            if (s.isFree()) {
                freeSpots.merge(s.getType(), 1, Integer::sum);
            }
        }
    }

    public void show() {
        System.out.println("===== Display Board =====");
        freeSpots.forEach((t, c) -> System.out.println(" " + t + " : " + c + " free "));
        System.out.println("=========================");
    }

    public boolean hasFreeSpotsFor(VehicleType vt) {
        return switch (vt) {
            case MOTORCYCLE -> freeSpots.getOrDefault(SpotType.COMPACT, 0) > 0
                    || freeSpots.getOrDefault(SpotType.LARGE, 0) > 0;
            case CAR -> freeSpots.getOrDefault(SpotType.COMPACT, 0) > 0
                    || freeSpots.getOrDefault(SpotType.LARGE, 0) > 0;
            case TRUCK -> freeSpots.getOrDefault(SpotType.LARGE, 0) > 0;
        };
    }
}
