package SOLID.D;

public class UPIPayment implements payment{

    @Override
    public void startTransaction() {
        System.out.println("Making payment via UPI");
    }
}
