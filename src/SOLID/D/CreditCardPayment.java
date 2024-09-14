package SOLID.D;

public class CreditCardPayment implements payment{
    @Override
    public void startTransaction() {
        System.out.println("Making payment via Credit Card");
    }
}
