package ParkingLot.parking;

import ParkingLot.vehicle.Vehicle;

public class ParkingSpot {
    private int id;
    private Size size;
    private ParkingSpotType spotType;
    private Vehicle vehicle;
    private ParkingSpotStatus status;
    public boolean isAvailable(){
        return status==ParkingSpotStatus.AVAILABLE;
    }
    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        status = ParkingSpotStatus.UNAVAILABLE;
    }
    public boolean canPark(Vehicle vehicle){
       return isAvailable() && vehicle.getVehicleSize().getNumber()<= size.getNumber();
    }
    public void unparkVehicle(){
        status = ParkingSpotStatus.AVAILABLE;
        vehicle = null;
    }
    public ParkingSpotType parkingSpotType(){
        return spotType;
    }
    public ParkingSpot(int id, ParkingSpotType type){
        this.id = id;
        this.spotType = type;
    }
}
