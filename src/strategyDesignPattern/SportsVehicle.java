package strategyDesignPattern;

import strategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {super(new SportsDriveStrategy());}
}
