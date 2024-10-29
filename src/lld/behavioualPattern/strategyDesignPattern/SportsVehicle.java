package lld.behavioualPattern.strategyDesignPattern;

import lld.behavioualPattern.strategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {super(new SportsDriveStrategy());}
}
