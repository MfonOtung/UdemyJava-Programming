package org.mfon.section11_Abstraction_in_Java.Interfaces;

import java.util.List;

public interface Card {
    double currentAmount(int pin);

    List<CardTransaction> accountHistory();

    CardTransaction sendMoney(CardTransaction toThePerson);

    void myName();
}
