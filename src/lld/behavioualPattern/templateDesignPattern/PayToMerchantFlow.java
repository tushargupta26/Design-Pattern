package lld.behavioualPattern.templateDesignPattern;

public class PayToMerchantFlow extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("Validating logic of payToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees logic of payToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of payToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the amount logic of payToMerchant");
    }
}
