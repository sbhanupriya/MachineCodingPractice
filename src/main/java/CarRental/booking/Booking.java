package CarRental.booking;

import CarRental.vehicle.Vehicle;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Booking {
    private int bookingId;
    private Vehicle vehicle;
    private BookingStatus bookingStatus;
    private BigDecimal price;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    public Booking(Vehicle vehicle, BookingRequest request ){
        this.vehicle = vehicle;
        this.startDate = request.getStart();
        this.endDate = request.getEnd();
    }
    public void setPrice(BigDecimal cost){
        this.price = cost;
    }
}
