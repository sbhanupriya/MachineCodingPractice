package ParkingLot.pricing;

import ParkingLot.ticket.Ticket;

import java.math.BigDecimal;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public BigDecimal getPrice(Ticket ticket) {
        return BigDecimal.ZERO;
    }
}
