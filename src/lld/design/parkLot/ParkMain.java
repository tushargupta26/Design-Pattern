package lld.design.parkLot;

import lld.design.parkLot.address.Address;
import lld.design.parkLot.address.AddressBuilder;

public class ParkMain {
    public static void main(String[] args) {
        String parkingName = "Parking 1";
        Address address = new AddressBuilder().setCity("Hyd").setState("Telangana").setCountry("India").build();

    }
}
