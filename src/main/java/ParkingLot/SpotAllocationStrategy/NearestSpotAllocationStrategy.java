package ParkingLot.SpotAllocationStrategy;

import ParkingLot.parking.ParkingLevel;
import ParkingLot.parking.ParkingSpot;
import ParkingLot.vehicle.Vehicle;

import java.util.List;

public class NearestSpotAllocationStrategy implements SpotAllocationStrategy {

    @Override
    public ParkingSpot getParkingSpot(Vehicle vehicle, List<ParkingLevel> parkingLevelList) {
        for(ParkingLevel level: parkingLevelList){
            for(ParkingSpot spot: level.getParkingSpots()){
                if(spot.isAvailable())
                    return spot;
            }
        }

        throw new RuntimeException("No Parking Spots Available");
    }
}
