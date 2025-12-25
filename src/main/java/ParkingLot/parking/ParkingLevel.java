package ParkingLot.parking;

import java.util.List;

public class ParkingLevel {
    private List<ParkingSpot> parkingSpots;
    private int level;
    public ParkingLevel(int level, List<ParkingSpot> parkingSpots){
        this.level = level;
        this.parkingSpots = parkingSpots;
    }
    public List<ParkingSpot> getParkingSpots(){
        return parkingSpots;
    }
    public void addParkingSpots(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }
    public int getLevel(){
        return level;
    }
}
