package CarRental.booking;

import CarRental.vehicle.VehicleType;

import java.time.Duration;
import java.time.OffsetDateTime;

public class BookingRequest {
    private VehicleType vehicleType;
    private OffsetDateTime start;
    private OffsetDateTime end;
    public VehicleType getVehicleType(){
        return vehicleType;
    }
    public long getDuration(){
        return Duration.between(start,end).toHours();
    }
    public OffsetDateTime getStart(){
        return start;
    }
    public OffsetDateTime getEnd(){
        return start;
    }
}
