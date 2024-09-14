package behavioualPattern.strategyDesignPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Driving Normal Mode");
    }
}
