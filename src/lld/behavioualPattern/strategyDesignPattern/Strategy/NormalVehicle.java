package lld.behavioualPattern.strategyDesignPattern.Strategy;

import lld.behavioualPattern.strategyDesignPattern.Vehicle;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
