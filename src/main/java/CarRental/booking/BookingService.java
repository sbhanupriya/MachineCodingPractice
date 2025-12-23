package CarRental.booking;

import CarRental.payment.Payment;
import CarRental.payment.PaymentProcessor;
import CarRental.pricing.PricingModel;
import CarRental.vehicle.Vehicle;

import javax.swing.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class BookingService {
    private Map<Vehicle, List<Booking>> activeBookings;
    private PricingModel pricingModel;
    private PaymentProcessor paymentProcessor;
    public void setPricingModel(PricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }

    public boolean isAvailable(BookingRequest bookingRequest, Vehicle vehicle) {
        return true;
    }

    public boolean bookVehicle(Vehicle vehicle, BookingRequest bookingRequest) {
        synchronized (vehicle) {
            if (!isAvailable(bookingRequest, vehicle))
                return false;
            Booking booking = new Booking(vehicle, bookingRequest);
            booking.setPrice(pricingModel.calculatePrice(booking));
            activeBookings.get(vehicle.getVehicleType()).add(booking);
            int retry = 0;
            while(paymentProcessor.processPayment(new Payment())==false){
                retry++;
            }
            return true;
        }
    }
}