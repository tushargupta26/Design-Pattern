package lld.behavioualPattern.strategyDesignPattern.Strategy;

import lld.behavioualPattern.strategyDesignPattern.Vehicle;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
