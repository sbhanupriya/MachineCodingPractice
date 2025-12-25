package ParkingLot;

import ParkingLot.parking.ParkingLevel;
import ParkingLot.parking.ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private Map<Integer, ParkingLevel> parkingLevelMap;
    public InventoryService(){
        parkingLevelMap = new HashMap<>();
    }
    public void addParkingLevel(ParkingLevel level){
        if(parkingLevelMap.get(level.getLevel())==null)
            parkingLevelMap.put(level.getLevel(), level);
    }
    public void addParkingSpot(ParkingSpot spot, int level){
        if(parkingLevelMap.get(level)==null)
            addParkingLevel(new ParkingLevel(level, new ArrayList<>()));

        parkingLevelMap.get(level).addParkingSpots(spot);
    }

    public List<ParkingLevel> getParkingLevels(){
        return parkingLevelMap.values().stream().toList();
    }
}
