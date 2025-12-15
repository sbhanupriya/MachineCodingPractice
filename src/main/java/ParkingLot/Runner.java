package ParkingLot;

import ParkingLot.gate.EntryGate;
import ParkingLot.gate.ExitGate;
import ParkingLot.ticket.Ticket;
import ParkingLot.vehicle.Vehicle;
import ParkingLot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        List<EntryGate> entryGateList = new ArrayList<>();
        entryGateList.add(new EntryGate(1));
        entryGateList.add(new EntryGate(2));


        List<ExitGate> exitGates = new ArrayList<>();
        exitGates.add(new ExitGate());
        exitGates.add(new ExitGate());

        Ticket ticket = entryGateList.get(1).parking(new Vehicle("123", VehicleType.CAR));

        exitGates.get(0).processTicket(ticket);
    }
}
