package strategyDesignPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Driving Sports Mode");
    }

}
