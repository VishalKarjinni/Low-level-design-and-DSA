package lld_problems.car_parking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ticket {
    private static int counter = 0;
    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketId = "TKT-" + (++counter);
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
    }

    public void martExit() {
        this.exitTime = LocalDateTime.now();
    }

    public long getDurationHours() {
        if (exitTime == null) return 0;
        long min = ChronoUnit.MINUTES.between(entryTime, exitTime);
        return Math.max(1, (long) Math.ceil((double) min / 60));
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot.getSpotId() +
                ", entryTime=" + entryTime +
                '}';
    }
}
