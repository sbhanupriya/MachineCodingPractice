package ParkingLot.parking;

public enum Size {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    int number;
    Size(int n){
        this.number = n;
    }
    public int getNumber() {
        return number;
    }
}
