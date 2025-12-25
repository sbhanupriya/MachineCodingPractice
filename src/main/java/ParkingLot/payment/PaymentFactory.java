package ParkingLot.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    private static Map<PaymentMode, PaymentStrategy> paymentModePaymentStrategyMap = new HashMap<>();
    public static PaymentStrategy getPaymentStrategy(PaymentMode paymentMode) {
        if(paymentModePaymentStrategyMap.get(paymentMode)==null)
            throw new RuntimeException("Payment Mode is not handled " + paymentMode);
        return paymentModePaymentStrategyMap.get(paymentMode);
    }
}
