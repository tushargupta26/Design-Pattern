package lld.design.parkLot.address;

public class Address {
    private String city;
    private String country;
    private String state;
    private int pinCode;
    private String lane;

    public Address(AddressBuilder builder){
        this.city = builder.getCity();
        this.country = builder.getCountry();
        this.state = builder.getState();
        this.lane = builder.getLane();
        this.pinCode = builder.getPinCode();
    }
}
