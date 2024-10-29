package lld.design.carRental;

import lld.design.carRental.product.Vehicle;

import java.util.List;

public class VehicleInventoryManagment {

    List<Vehicle> vehicles;

    public VehicleInventoryManagment(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
