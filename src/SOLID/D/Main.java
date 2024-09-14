package SOLID.D;

public class Main {
    public static void main(String[] args) {
        MakePayment makePayment = new MakePayment(new CreditCardPayment());
        makePayment.makePayment();
        MakePayment makePayment1 = new MakePayment(new UPIPayment());
        makePayment1.makePayment();
    }
}
