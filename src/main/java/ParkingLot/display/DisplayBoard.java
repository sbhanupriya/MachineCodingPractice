package ParkingLot.display;

import ParkingLot.parking.ParkingSpotType;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard {
    private Map<ParkingSpotType, Integer> availabilityCount;
    public DisplayBoard(){
        this.availabilityCount = new HashMap<>();
    }
    public void update(ParkingSpotType spot, Integer c){
        availabilityCount.put(spot, availabilityCount.get(spot)+c);
    }
    public void display(){
        for(Map.Entry<ParkingSpotType, Integer> parkingSpotIntegerEntry: availabilityCount.entrySet()){
            System.out.println(parkingSpotIntegerEntry.getKey() + " ---->  " + parkingSpotIntegerEntry.getValue());
        }
    }
}
