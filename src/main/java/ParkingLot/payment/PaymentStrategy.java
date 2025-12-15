package ParkingLot.payment;

import java.math.BigDecimal;

public interface PaymentStrategy {
    public boolean processPayment(BigDecimal amount);
}
