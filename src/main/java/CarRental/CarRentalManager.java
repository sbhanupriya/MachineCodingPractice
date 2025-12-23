package CarRental;

import CarRental.booking.Booking;
import CarRental.booking.BookingRequest;
import CarRental.booking.BookingService;
import CarRental.pricing.PricingModel;
import CarRental.vehicle.Vehicle;
import CarRental.vehicle.VehicleType;

import java.math.BigDecimal;
import java.util.*;

public class CarRentalManager {
    private static volatile CarRentalManager instance;
    private CarRentalManager(){
        inventory = new HashMap<>();
        bookingService = new BookingService();
    }
    private PricingModel pricingModel;
    private BookingService bookingService;
    public void setPricingModel(PricingModel model){
        this.pricingModel = model;
    }
    private Map<VehicleType, List<Vehicle>> inventory;
    public static CarRentalManager getInstance(){
        if(instance==null){
            synchronized (CarRentalManager.class){
                if(instance==null)
                    instance = new CarRentalManager();
            }
        }
        return  instance;
    }
    public void add(Vehicle vehicle){
        if(inventory.get(vehicle.getVehicleType())==null)
            inventory.put(vehicle.getVehicleType(), new ArrayList<>());
        inventory.get(vehicle.getVehicleType()).add(vehicle);
    }
    public boolean makeBoooking(BookingRequest bookingRequest){
        if(inventory.get(bookingRequest.getVehicleType())==null)
            throw new RuntimeException("Vehicle Not Available");

        List<Vehicle> vehicles = inventory.get(bookingRequest.getVehicleType()).stream().filter(vehicle1 -> bookingService.isAvailable(bookingRequest, vehicle1)).toList();
        for(Vehicle vehicle: vehicles){
            if(bookingService.bookVehicle(vehicle, bookingRequest))
                return true;
        }
        return false;
    }
}
