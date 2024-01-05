package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section6.LoopingStatements.LastDigitChecker;

public class LastDigitCheckerTest {
    @Test
    void lastDigitOfThreeOrTwoNumbersAreThesame (){assert LastDigitChecker.hasSameLastDigit(455,675,985) == true;}
    @Test
    void lastDigitOfThreeOrTwoNumbersAreThesame1 (){assert LastDigitChecker.hasSameLastDigit(455,675,989) == true;}
    @Test
    void withinRangeAndTwoSameLastDigit (){assert LastDigitChecker.hasSameLastDigit(5,675,985) == false;}
    @Test
    void lastDigitOfThreeOrTwoNumbersAreThesame2 (){assert LastDigitChecker.hasSameLastDigit(455,679,983) == false;}
    @Test
    void fourFiveFiveIsValid (){assert LastDigitChecker.isValid(455) == true;}
    @Test
    void negativeFourFiveFiveIsValid (){assert LastDigitChecker.isValid(-455) == false;}
    @Test
    void AboveOneThousandIsValid (){assert LastDigitChecker.isValid(1051) == false;}
}
