package ParkingLot.pricing;

import ParkingLot.ticket.Ticket;

import java.math.BigDecimal;

public interface PricingStrategy {
    public BigDecimal getPrice(Ticket ticket);
}
