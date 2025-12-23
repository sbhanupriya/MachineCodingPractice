package CarRental.payment;

public interface PaymentProcessor {
    boolean processPayment(Payment payment);
}
