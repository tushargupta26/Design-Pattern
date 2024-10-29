package lld.parkLot.address;

public class AddressBuilder {
    private String city;
    private String country;
    private String state;
    private int pinCode;
    private String lane;

    public String getCity() {
        return city;
    }

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public String getLane() {
        return country;
    }

    public AddressBuilder setLane(String lane) {
        this.country = lane;
        return this;
    }

    public String getState() {
        return state;
    }

    public AddressBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public int getPinCode() {
        return pinCode;
    }

    public AddressBuilder setPinCode(int pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    public AddressBuilder setCountry(String country){
        this.country = country;
        return this;
    }

    public String getCountry(){
        return this.country;
    }

    public Address build() {
        return new Address(this);
    }
}
