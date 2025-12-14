package ParkingLot.gate;

import ParkingLot.parking.ParkingLotManager;
import ParkingLot.parking.ParkingSpot;
import ParkingLot.ticket.Ticket;
import ParkingLot.vehicle.Vehicle;

public class EntryGate {
    private int gate;
    private ParkingLotManager parkingLotManager;
    public EntryGate(int number){
        this.gate = number;
        parkingLotManager = ParkingLotManager.getInstance();
    }
    public Ticket parking(Vehicle vehicle){
       ParkingSpot parkingSpot =  parkingLotManager.park(vehicle);
       Ticket ticket = new Ticket(vehicle,parkingSpot);
       return ticket;
    }
}
