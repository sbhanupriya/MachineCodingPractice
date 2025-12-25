package ParkingLot;

import ParkingLot.gate.EntryGate;
import ParkingLot.gate.ExitGate;
import ParkingLot.parking.ParkingLotManager;
import ParkingLot.ticket.Ticket;
import ParkingLot.vehicle.Vehicle;
import ParkingLot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotDemo {
    public static void main(String[] args){
        List<EntryGate> entryGateList = new ArrayList<>();
        entryGateList.add(new EntryGate(1));
        entryGateList.add(new EntryGate(2));

        List<ExitGate> exitGates = new ArrayList<>();
        exitGates.add(new ExitGate(1));
        exitGates.add(new ExitGate(2));

        ParkingLotManager.getInstance();

    }
}
