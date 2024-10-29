package lld.design.carRental;

import lld.design.carRental.product.Vehicle;
import lld.design.carRental.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int storeId;
    VehicleInventoryManagment inventoryManagment;
    Location location;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return inventoryManagment.getVehicles();
    }


    //addVehicles, update vehicles, use inventory management to update those.


    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagment = new VehicleInventoryManagment(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation

}
