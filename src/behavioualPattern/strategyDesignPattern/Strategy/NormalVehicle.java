package behavioualPattern.strategyDesignPattern.Strategy;

import behavioualPattern.strategyDesignPattern.Vehicle;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
