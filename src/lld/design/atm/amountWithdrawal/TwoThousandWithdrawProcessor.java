package lld.design.atm.amountWithdrawal;

import lld.design.atm.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor{

    public TwoThousandWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        super(cashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/2000;
        int balance = remainingAmount%2000;

        if(required <= atm.getNoOfTwoThousandNotes()){
            atm.deductTwoThousandNotes(required);
        } else if(required > atm.getNoOfTwoThousandNotes()){
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            balance += ((required - atm.getNoOfTwoThousandNotes())*2000);
            super.withdraw(atm, balance);
        }
    }
}
