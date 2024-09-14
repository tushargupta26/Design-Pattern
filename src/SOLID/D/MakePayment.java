package SOLID.D;

public class MakePayment {

    payment payment;
    public MakePayment(payment payment){
        this.payment = payment;
    }
    public void makePayment(){
        payment.startTransaction();
    }
}
