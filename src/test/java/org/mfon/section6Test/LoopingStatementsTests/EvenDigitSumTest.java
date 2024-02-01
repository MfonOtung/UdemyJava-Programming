package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section6_Control_Flow.LoopingStatements.EvenDigitSum;

public class EvenDigitSumTest {
    @Test
    void sumOfTwoAndTwo (){assert EvenDigitSum.getEvenDigitSum(252) == 4;}
    @Test
    void sumOfTwoAndTwoAndTwo (){assert EvenDigitSum.getEvenDigitSum(2522) == 6;}
}
