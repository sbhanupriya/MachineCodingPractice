package ParkingLot.pricing;

import ParkingLot.ticket.Ticket;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal getPrice(Ticket ticket);
}
