package ParkingLot.SpotAllocationStrategy;

import ParkingLot.parking.ParkingSpot;
import ParkingLot.vehicle.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getParkingSpot(Vehicle vehicle);
}
