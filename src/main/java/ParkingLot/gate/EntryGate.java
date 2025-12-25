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
    public Ticket parking(Vehicle vehicle) {
       return parkingLotManager.park(vehicle);
    }
}
