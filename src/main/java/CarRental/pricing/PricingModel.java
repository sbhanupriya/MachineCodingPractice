package CarRental.pricing;

import CarRental.booking.Booking;

import java.math.BigDecimal;

public interface PricingModel {
    BigDecimal calculatePrice(Booking booking);
}
