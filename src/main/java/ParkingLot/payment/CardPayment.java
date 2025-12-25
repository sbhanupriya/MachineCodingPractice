package ParkingLot.payment;

import java.math.BigDecimal;

public class CardPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(Payment payment) {
        return true;
    }
}
