package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section6.LoopingStatements.GreatestCommonDivisor;

import java.util.GregorianCalendar;

public class GreatestCommonDivisorTest {
    @Test
    void greatestCommonDivisorOfTenAndSixteen (){assert GreatestCommonDivisor.getGreatestCommonDivisor(10,16) == 2;}
    @Test
    void greatestCommonDivisorOfFourAndSixteen (){assert GreatestCommonDivisor.getGreatestCommonDivisor(4,16) == -1;}
    @Test
    void greatestCommonDivisorOfSixteenSixteen (){assert GreatestCommonDivisor.getGreatestCommonDivisor(16,16) == 16;}
}
