package ParkingLot.ticket;

import ParkingLot.parking.ParkingSpot;
import ParkingLot.payment.Payment;
import ParkingLot.vehicle.Vehicle;

import java.time.OffsetDateTime;

public class Ticket {
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Payment payment;
    private OffsetDateTime entryTime;
    private OffsetDateTime exitTime;
    public boolean isPaid(){
        return payment!=null && payment.isPaid();
    }
    public ParkingSpot getParkingSpot(){
        return parkingSpot;
    }
    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot){
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = OffsetDateTime.now();
    }
    public void setExitTime(OffsetDateTime offsetDateTime){
        this.exitTime = offsetDateTime;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }
}
