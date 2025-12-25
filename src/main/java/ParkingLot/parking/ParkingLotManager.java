package ParkingLot.parking;

import ParkingLot.InventoryService;
import ParkingLot.SpotAllocationStrategy.NearestSpotAllocationStrategy;
import ParkingLot.SpotAllocationStrategy.SpotAllocationStrategy;
import ParkingLot.display.DisplayBoard;
import ParkingLot.payment.Payment;
import ParkingLot.payment.PaymentFactory;
import ParkingLot.payment.PaymentMode;
import ParkingLot.payment.PaymentService;
import ParkingLot.pricing.HourlyPricingStrategy;
import ParkingLot.pricing.PricingStrategy;
import ParkingLot.ticket.Ticket;
import ParkingLot.vehicle.Vehicle;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class ParkingLotManager {
    private ParkingLotManager(){
    }
    private DisplayBoard displayBoard;
    private InventoryService inventoryService;
    private static ParkingLotManager parkingLotManager;
    private SpotAllocationStrategy spotAllocationStrategy;
    private PricingStrategy pricingStrategy;
    private PaymentService paymentService;

    public static ParkingLotManager getInstance(){
        if(parkingLotManager==null){
            synchronized (ParkingLotManager.class){
                if(parkingLotManager==null)
                    parkingLotManager = new ParkingLotManager();
                    parkingLotManager.setPricingStrategy(new HourlyPricingStrategy());
                    parkingLotManager.setSpotAllocationStrategy(new NearestSpotAllocationStrategy());
                    parkingLotManager.paymentService = new PaymentService();
                    parkingLotManager.inventoryService = new InventoryService();
            }
        }
        return parkingLotManager;
    }

    public synchronized Ticket park(Vehicle vehicle){
       ParkingSpot parkingSpot = spotAllocationStrategy.getParkingSpot(vehicle, inventoryService.getParkingLevels());
       Ticket ticket = new Ticket(vehicle, parkingSpot);
       return ticket;
    }
    public synchronized boolean unpark(Ticket ticket, PaymentMode mode){
        ticket.setExitTime(OffsetDateTime.now());
        BigDecimal cost = pricingStrategy.getPrice(ticket);
        Payment payment = new Payment(mode, cost);
        if(paymentService.processPayment(payment, PaymentFactory.getPaymentStrategy(mode)))
            ticket.getParkingSpot().unparkVehicle();
        else
            return false;
        return true;
        //displayBoard.update(parkingSpot.parkingSpotType(), 1);
    }


    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy){
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }


}
