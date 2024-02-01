package org.mfon.section5Test;

import org.junit.jupiter.api.Test;
import org.mfon.section5_Expressions_Statements_and_More.BarkingDog;

public class BarkingDogTest {
    @Test
    void barkingIsTrueAndTimeIsCorrect(){
        assert BarkingDog.shouldWakeUp(true, 6) == true;
    }
    @Test
    void barkingIsFalseAndTimeIsCorrect(){
        assert BarkingDog.shouldWakeUp(false, 23) == false;
    }
    @Test
    void barkingIsTrueAndTimeIsNotCorrect(){
        assert BarkingDog.shouldWakeUp(true, 12) == false;
    }
    @Test
    void barkingIsFalseAndTimeIsNotCorrect(){
        assert BarkingDog.shouldWakeUp(false, 4) == false;
    }
}
