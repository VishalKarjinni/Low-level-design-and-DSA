package lld_problems.car_parking;

public class SpotFactory {
    public static ParkingSpot create (SpotType type, String id, int floor) {
        return switch (type) {
            case COMPACT ->  new CompactSpot(id, floor);
            case LARGE -> new LargeSpot(id, floor);
            case HANDICAPPED -> new HandicappedSpot(id, floor);
        };
    }
}
