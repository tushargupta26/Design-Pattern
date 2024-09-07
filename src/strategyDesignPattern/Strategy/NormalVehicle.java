package strategyDesignPattern.Strategy;

import strategyDesignPattern.Vehicle;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
