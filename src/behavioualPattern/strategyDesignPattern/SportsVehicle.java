package behavioualPattern.strategyDesignPattern;

import behavioualPattern.strategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {super(new SportsDriveStrategy());}
}
