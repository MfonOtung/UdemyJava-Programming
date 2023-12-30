package org.mfon.section5Test;

import org.junit.jupiter.api.Test;
import org.mfon.section5.BarkingDog;
import org.mfon.section5.SpeedConverter;

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
