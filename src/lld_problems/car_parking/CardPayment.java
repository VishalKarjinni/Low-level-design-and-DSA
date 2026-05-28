package lld_problems.car_parking;

public class CardPayment implements PaymentStrategy{
    private final String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.printf("Card %s charged ₹%.2f successfully.%n",
                cardNumber.substring(cardNumber.length() - 4), amount);
        return true;
    }


}
