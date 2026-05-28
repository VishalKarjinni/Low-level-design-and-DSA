package lld_problems.car_parking;

public class CashPayment implements PaymentStrategy  {
    private final double tendered;

    public CashPayment(double tendered) {
        this.tendered = tendered;
    }

    @Override
    public boolean pay(double amount) {
        if (tendered < amount) {
            System.out.println("Insufficient cash. Required :" + amount + ", Tendered: " + tendered);
            return false;
        }
        System.out.println("Cash Payment has been done successfully" + amount + ", " + (tendered - amount));
        return true;
    }
}
