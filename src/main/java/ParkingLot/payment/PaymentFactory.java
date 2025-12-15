package ParkingLot.payment;

import java.math.BigDecimal;

public class PaymentFactory {
    public static Payment getPayment(String paymentType, BigDecimal amount){
        if(paymentType.equals("CARD"))
            return new Payment(new CardPayment(), amount);
        else
            return null;
    }
}
