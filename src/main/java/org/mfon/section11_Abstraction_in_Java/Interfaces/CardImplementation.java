package org.mfon.section11_Abstraction_in_Java.Interfaces;

import java.util.List;

public class CardImplementation implements Card {
    @Override
    public void myName(){

    }
    @Override
    public double currentAmount(int pin) {
        // TODO: ou can now write your code here
        return 0;
    }

    @Override
    public List<CardTransaction> accountHistory() {
        // TODO: ou can now write your code here

        return null;
    }

    @Override
    public CardTransaction sendMoney(CardTransaction toThePerson) {
        // TODO: ou can now write your code here

        return null;
    }

    public void myStory(){
        // TODO: ou can now write your code here

    }
}
