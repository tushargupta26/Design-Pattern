package lld.parkLot;

import lld.behavioualPattern.strategyDesignPattern.Vehicle;
import lld.parkLot.model.ParkingSlotType;

public class ParkingSlot {

    private String name;
    private boolean isAvailable;
    private Vehicle vehicle;
    private ParkingSlotType parkingSlotType;

    public ParkingSlot(String name, ParkingSlotType parkingSlotType){
        this.name = name;
        this.parkingSlotType = parkingSlotType;
    }

    protected void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    protected void removeVehicle(Vehicle vehicle){
        this.vehicle = null;
        this.isAvailable = true;
    }

    

}
