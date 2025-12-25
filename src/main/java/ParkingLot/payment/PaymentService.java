package ParkingLot.payment;

public class PaymentService {
    private int maxRetryCount = 3;
    public boolean processPayment(Payment payment, PaymentStrategy paymentStrategy){
        while(!payment.isPaid() && (payment.getRetryCount()<maxRetryCount)){
            payment.incrementRetryCount();
            paymentStrategy.processPayment(payment);
        }
        return payment.isPaid();
    }
}
