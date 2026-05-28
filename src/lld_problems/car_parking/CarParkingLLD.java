package lld_problems.car_parking;

public class CarParkingLLD {
    public static void main(String[] args) throws IllegalAccessException {
        // 1. Build the lot
        ParkingLot lot = ParkingLot.getInstanceOfParkingLot("Central Parking");

        ParkingFloor g = new ParkingFloor(0);
        g.addSpot(SpotFactory.create(SpotType.COMPACT,     "G-C1", 0));
        g.addSpot(SpotFactory.create(SpotType.COMPACT,     "G-C2", 0));
        g.addSpot(SpotFactory.create(SpotType.LARGE,       "G-L1", 0));
        g.addSpot(SpotFactory.create(SpotType.HANDICAPPED, "G-H1", 0));
        lot.addFloor(g);

        ParkingFloor f1 = new ParkingFloor(1);
        f1.addSpot(SpotFactory.create(SpotType.COMPACT, "F1-C1", 1));
        f1.addSpot(SpotFactory.create(SpotType.LARGE,   "F1-L1", 1));
        lot.addFloor(f1);

        System.out.println("\n--- Initial State ---");
        lot.getDisplayBoard().show();

        // 2. Vehicles arrive
        Vehicle car1   = new Car("KA-01-AB-1234");
        Vehicle moto1  = new MotorCycle("KA-02-XY-9999");
        Vehicle truck1 = new Truck("MH-12-CD-5678");

        Ticket t1 = lot.checkIn(car1);
        Ticket t2 = lot.checkIn(moto1);
        Ticket t3 = lot.checkIn(truck1);

        System.out.println("\n--- After 3 check-ins ---");
        lot.getDisplayBoard().show();

        // 3. Exits
        System.out.println("\n--- Checkout ---");
        if (t1 != null)
            lot.checkOut(t1.getTicketId(), new CardPayment("4111111111111234"));

        if (t2 != null)
            lot.checkOut(t2.getTicketId(), new CashPayment(100));   // ₹100 cash tendered

        if (t3 != null)
            lot.checkOut(t3.getTicketId(), new CashPayment(20));    // insufficient

        System.out.println("\n--- Final State ---");
        lot.getDisplayBoard().show();
    }
}
