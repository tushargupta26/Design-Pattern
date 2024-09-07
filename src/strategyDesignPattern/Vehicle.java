package strategyDesignPattern;

import strategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}
