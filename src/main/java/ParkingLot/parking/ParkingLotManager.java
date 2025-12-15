package ParkingLot.parking;

import ParkingLot.SpotAllocationStrategy.SpotAllocationStrategy;
import ParkingLot.display.DisplayBoard;
import ParkingLot.vehicle.Vehicle;

import java.util.List;

public class ParkingLotManager {
    private ParkingLotManager(){
    }
    private DisplayBoard displayBoard;
    private static ParkingLotManager parkingLotManager;
    private List<ParkingLevel> parkingLevelList;
    private SpotAllocationStrategy spotAllocationStrategy;
    public static ParkingLotManager getInstance(){
        if(parkingLotManager==null){
            synchronized (ParkingLotManager.class){
                if(parkingLotManager==null)
                    parkingLotManager = new ParkingLotManager();
            }
        }
        return parkingLotManager;
    }
    public synchronized ParkingSpot park(Vehicle vehicle){
       ParkingSpot parkingSpot = spotAllocationStrategy.getParkingSpot(vehicle);
       displayBoard.update(parkingSpot.parkingSpotType(), -1);
       return parkingSpot;
    }


    public synchronized void unpark(ParkingSpot parkingSpot){
        parkingSpot.setAvailable(true);
        displayBoard.update(parkingSpot.parkingSpotType(), 1);
    }

}
