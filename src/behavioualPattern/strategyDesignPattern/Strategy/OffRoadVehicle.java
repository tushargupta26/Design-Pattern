package behavioualPattern.strategyDesignPattern.Strategy;

import behavioualPattern.strategyDesignPattern.Vehicle;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
