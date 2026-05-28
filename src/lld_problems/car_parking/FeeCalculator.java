package lld_problems.car_parking;

import java.util.EnumMap;
import java.util.Map;

public class FeeCalculator {
    private static final Map<VehicleType, Double> RATE = new EnumMap<>(VehicleType.class);

    static {
        RATE.put(VehicleType.CAR, 40.0);
        RATE.put(VehicleType.MOTORCYCLE, 20.0);
        RATE.put(VehicleType.TRUCK, 80.0);
    }

    public double calculate(Ticket ticket) {
        ticket.martExit();
        double rate = RATE.get(ticket.getVehicle().getVehicleType());
        return rate * ticket.getDurationHours();
    }
}
