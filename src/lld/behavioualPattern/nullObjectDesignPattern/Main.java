package lld.behavioualPattern.nullObjectDesignPattern;

public class Main {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        System.out.println(vehicle.getSeatingCapacity());
    }
}
