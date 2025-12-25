package ParkingLot.vehicle;

import ParkingLot.parking.Size;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Size vehicleSize;
    public Vehicle(String num, VehicleType type, Size size){
        this.vehicleNumber = num;
        this.vehicleType = type;
        this.vehicleSize = size;
    }
    public VehicleType vehicleType(){
        return vehicleType;
    }
    public Size getVehicleSize(){
        return vehicleSize;
    }
}
