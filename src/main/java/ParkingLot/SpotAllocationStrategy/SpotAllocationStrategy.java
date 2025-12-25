package ParkingLot.SpotAllocationStrategy;

import ParkingLot.parking.ParkingLevel;
import ParkingLot.parking.ParkingSpot;
import ParkingLot.vehicle.Vehicle;

import java.util.List;

public interface SpotAllocationStrategy {
    ParkingSpot getParkingSpot(Vehicle vehicle, List<ParkingLevel> parkingLevelList);
}
