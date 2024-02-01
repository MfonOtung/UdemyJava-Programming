package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section6_Control_Flow.LoopingStatements.SumOddRange;

public class SumOddRangeTest {
    @Test
    void sumOfRangeOfOddNumberBetweenOneAneFive (){assert SumOddRange.sumOdd(1, 100) == 2500;}
    @Test
    void sumOfRangeOfOddNumberBetweenMinusOneAneOneHundred (){assert SumOddRange.sumOdd(-1, 100) == -1;}
    @Test
    void sumOfRangeOfOddNumberBetweenOneHundredAneOneHundred (){assert SumOddRange.sumOdd(100, 100) == 0;}
    @Test
    void sumOfRangeOfOddNumberBetweenThirteenAneThirteen (){assert SumOddRange.sumOdd(13, 13) == 13;}
    @Test
    void sumOfRangeOfOddNumberBetweenMinusOneHundredAneOneHundred (){assert SumOddRange.sumOdd(100, -100) == -1;}
    @Test
    void sumOfRangeOfOddNumberBetweenOneHundredAneOneThousand (){assert SumOddRange.sumOdd(100, 1000) == 247500;}
}
