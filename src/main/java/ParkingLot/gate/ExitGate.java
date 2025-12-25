package ParkingLot.gate;

import ParkingLot.parking.ParkingLotManager;
import ParkingLot.payment.PaymentMode;
import ParkingLot.pricing.PricingStrategy;
import ParkingLot.ticket.Ticket;
import ParkingLot.payment.Payment;
import ParkingLot.payment.PaymentFactory;

public class ExitGate {
    private int gate;
    private static ParkingLotManager parkingLotManager = ParkingLotManager.getInstance();
    public ExitGate(int gate){
        this.gate = gate;
    }
    public boolean processTicket(Ticket ticket, PaymentMode mode){
        return parkingLotManager.unpark(ticket, mode);
    }
}
