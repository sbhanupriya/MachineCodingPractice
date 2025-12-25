package ParkingLot.payment;

import java.math.BigDecimal;

public class Payment {
    private BigDecimal amount;
    private boolean status;
    private PaymentMode paymentMode;
    private Integer retryCount;
    public Payment(PaymentMode mode, BigDecimal amount){
        this.amount = amount;
        this.paymentMode = mode;
        this.retryCount = 0;
    }
    public int getRetryCount(){
        return retryCount;
    }
    public boolean isPaid(){
        return status;
    }
    public void incrementRetryCount(){
        retryCount++;
    }
}
