package lld.behavioualPattern.strategyDesignPattern;

import lld.behavioualPattern.strategyDesignPattern.Strategy.NormalVehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new NormalVehicle();
        vehicle1.drive();
    }
}
