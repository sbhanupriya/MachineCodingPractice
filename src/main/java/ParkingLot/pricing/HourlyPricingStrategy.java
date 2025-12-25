package ParkingLot.pricing;

import ParkingLot.ticket.Ticket;

import java.math.BigDecimal;
import java.time.Duration;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public BigDecimal getPrice(Ticket ticket) {
        long hours = Duration.between(ticket.getExitTime(), ticket.getEntryTime()).toHours();
        if(hours<=2)
            return BigDecimal.valueOf(hours).multiply(BigDecimal.valueOf(10));
        else
            return BigDecimal.valueOf(hours).multiply(BigDecimal.valueOf(30));
    }
}
