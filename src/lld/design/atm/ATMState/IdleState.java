package lld.design.atm.ATMState;

import lld.design.atm.ATM;
import lld.design.atm.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }

}
