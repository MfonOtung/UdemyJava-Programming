package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section5.BarkingDog;
import org.mfon.section6.LoopingStatements.FirstLastDigitSum;

public class FirstLastDigitSumTest {
    @Test
    void sumOfTwoAndTwoIsFour(){assert FirstLastDigitSum.sumFirstAndLastDigit(252) == 4;}
    @Test
    void sumOfTwoAndSevenIsNine(){assert FirstLastDigitSum.sumFirstAndLastDigit(257) == 9;}
    @Test
    void sumOfZeroAndZeroIsZero(){assert FirstLastDigitSum.sumFirstAndLastDigit(0) == 0;}
    @Test
    void sumOfFiveAndFiveIsTen(){assert FirstLastDigitSum.sumFirstAndLastDigit(5) == 10;}
}
