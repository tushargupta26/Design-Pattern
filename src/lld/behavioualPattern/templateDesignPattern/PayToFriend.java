package lld.behavioualPattern.templateDesignPattern;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validating logic of payToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees logic of payToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of payToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the amount logic of payToFriend");
    }
}
