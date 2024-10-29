package lld.behavioualPattern.nullObjectDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String type){
        if(type.equals("Car"))
            return new Car();
        else
            return new NullVehicle();
    }

}
