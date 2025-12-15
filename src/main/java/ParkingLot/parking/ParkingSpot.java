package ParkingLot.parking;

public class ParkingSpot {
    private int id;
    private int parkingLevel;
    private ParkingSpotType spotType;
    private boolean isAvailable;
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public ParkingSpotType parkingSpotType(){
        return spotType;
    }
}
