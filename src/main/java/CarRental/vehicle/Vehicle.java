package CarRental.vehicle;


import java.math.BigDecimal;

public class Vehicle {
    private String vehicleNumber;
    private int seatingCapacity;
    private String modelNumber;
    private BigDecimal basePrice;
    private VehicleType vehicleType;

    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
