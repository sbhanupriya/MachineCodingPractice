package ParkingLot.pricing;

import ParkingLot.ticket.Ticket;

import java.math.BigDecimal;
import java.time.Duration;

public class FixedPricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal getPrice(Ticket ticket) {
        long hours = Duration.between(ticket.getExitTime(), ticket.getEntryTime()).toHours();
        BigDecimal cost = BigDecimal.valueOf(10);
        switch(ticket.getVehicle().vehicleType()){
            case TRUCK:
                cost = BigDecimal.valueOf(30);
                break;
            case BIKE:
                cost = BigDecimal.valueOf(15);
                break;
            case CAR:
                cost = BigDecimal.valueOf(20);
                break;
            default:
                throw new RuntimeException("Vehcile type not handled for " + ticket.getVehicle().vehicleType().toString());
        }
        return cost;
    }
}
