package ParkingLot.gate;

import ParkingLot.parking.ParkingLotManager;
import ParkingLot.pricing.PricingStrategy;
import ParkingLot.ticket.Ticket;
import ParkingLot.payment.Payment;
import ParkingLot.payment.PaymentFactory;

public class ExitGate {
    private int gate;
    private static ParkingLotManager parkingLotManager;
    private PricingStrategy pricingStrategy;
    public boolean processTicket(Ticket ticket){
        while(!ticket.isPaid()){
            System.out.println("Choose your payment method");
            Payment payment = PaymentFactory.getPayment("CARD", pricingStrategy.getPrice(ticket));
            if(payment.processPayment())
                ticket.setPayment(payment);
        }
        parkingLotManager.unpark(ticket.getParkingSpot());
        return true;
    }
}
