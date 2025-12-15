package ParkingLot.payment;

import java.math.BigDecimal;

public class Payment {
    private PaymentStrategy paymentStrategy;
    private BigDecimal amount;
    private boolean success;
    public Payment(PaymentStrategy paymentStrategy, BigDecimal amount){
        this.paymentStrategy = paymentStrategy;
        this.amount = amount;
    }
    public boolean processPayment(){
       success = this.paymentStrategy.processPayment(amount);
       return success;
    }
    public boolean isPaid(){
        return success;
    }
}
