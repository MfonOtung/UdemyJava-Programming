package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section6.LoopingStatements.SharedDigit;

public class SharedDigitTest {
    @Test
    void bothNumbersShareDigitFive (){assert SharedDigit.hasSharedDigit(65,35)== true;}
    @Test
    void bothNumbersShareDigitFiveAndWithinRange (){assert SharedDigit.hasSharedDigit(165,35) == false;}
    @Test
    void bothNumbersHaveDigitFiveAndWithinRange (){assert SharedDigit.hasSharedDigit(56,35) == true;}

}
