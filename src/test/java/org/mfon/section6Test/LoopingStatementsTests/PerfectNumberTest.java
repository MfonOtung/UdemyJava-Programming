package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section6_Control_Flow.LoopingStatements.PerfectNumber;

public class PerfectNumberTest {
    @Test
    void sixIsAPerfectNumber (){assert PerfectNumber.isPerfectNumber(6) == true;}
    @Test
    void twentyEightIsAPerfectNumber (){assert PerfectNumber.isPerfectNumber(28) == true;}
    @Test
    void fiveIsAPerfectNumber (){assert PerfectNumber.isPerfectNumber(5) == false;}
    @Test
    void negativeOneIsAPerfectNumber (){assert PerfectNumber.isPerfectNumber(-1) == false;}
}
