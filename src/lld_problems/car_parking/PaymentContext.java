package lld_problems.car_parking;

public class PaymentContext {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy s) {
        this.strategy = s;
    }

    public boolean executePayment(double amount) throws IllegalAccessException {
        if (strategy == null) throw new IllegalAccessException("No Payment Strategy Set");
        return strategy.pay(amount);
    }
}
