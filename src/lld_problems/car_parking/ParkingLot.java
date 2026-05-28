package lld_problems.car_parking;

import java.util.*;

public class ParkingLot {

    private static volatile ParkingLot parkingLot;

    private final String name;
    private final List<ParkingFloor> floors = new ArrayList<>();
    private final Map<String, Ticket> activeTicketMap = new HashMap<>();
    private final FeeCalculator feeCalculator = new FeeCalculator();
    private final DisplayBoard displayBoard = new DisplayBoard();

    private ParkingLot(String name) {
        this.name = name;
    }

    public static ParkingLot getInstanceOfParkingLot(String name) {
        if (parkingLot == null) {
            synchronized (ParkingLot.class) {
                if (parkingLot == null) {
                    parkingLot = new ParkingLot(name);
                }
            }
        }
        return parkingLot;
    }

    public void addFloor(ParkingFloor parkingFloor) {
        floors.add(parkingFloor);
        refreshDashBoard();
    }

    private void refreshDashBoard() {
        List<ParkingSpot> all = new ArrayList<>();
        floors.forEach(f -> all.addAll(f.getAllSpots()));
        displayBoard.update(all);
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public String getName() {
        return name;
    }

    public Ticket checkIn(Vehicle vehicle) {
        refreshDashBoard();
        if (!displayBoard.hasFreeSpotsFor(vehicle.getVehicleType())) {
            System.out.println("Lot full for " + vehicle.getVehicleType());
            return null;
        }
        ParkingSpot bestSpot = findBestSpot(vehicle.getVehicleType());
        if (bestSpot == null) return null;
        bestSpot.assignVehicle(vehicle);
        Ticket ticket = new Ticket(vehicle, bestSpot);
        activeTicketMap.put(ticket.getTicketId(), ticket);
        refreshDashBoard();
        System.out.println("CHECK-IN -> " + ticket);
        return ticket;
    }

    public Double checkOut(String ticketId, PaymentStrategy paymentStrategy) throws IllegalAccessException {
        Ticket ticket = activeTicketMap.get(ticketId);
        if (ticket == null)  {
            System.out.println("Invalid Ticket : " + ticketId);
            return -1D;
        }

        double fee = feeCalculator.calculate(ticket);
        System.out.printf("CHECK-OUT -> %S | Duration : %dh | Fee : ₹%.2f%n", ticketId, ticket.getDurationHours(), fee);

        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setStrategy(paymentStrategy);
        if (paymentContext.executePayment(fee)) {
            ticket.getParkingSpot().freeSpot();
            activeTicketMap.remove(ticketId);
            refreshDashBoard();
        }
        return fee;
    }

    private ParkingSpot findBestSpot(VehicleType vehicleType) {
        for (ParkingFloor floor : floors) {
            Optional<ParkingSpot> availableSpots = floor.findAvailableSpots(vehicleType);
            if (availableSpots.isPresent()) {
                return availableSpots.get();
            }
        }
        return null;
    }


}
