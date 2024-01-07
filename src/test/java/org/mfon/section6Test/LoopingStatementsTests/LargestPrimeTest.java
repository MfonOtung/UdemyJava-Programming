package org.mfon.section6Test.LoopingStatementsTests;

import org.junit.jupiter.api.Test;
import org.mfon.section6.LoopingStatements.LargestPrime;

public class LargestPrimeTest {
    @Test
    void sevenIsTheLargestPrimeOfTwentyOne (){assert LargestPrime.getLargestPrime(21) == 7;}
    @Test
    void thirtyOneIsTheLargestPrimeOfTwentyOneSeven (){assert LargestPrime.getLargestPrime(217) == 31;}
    @Test
    void negativeOneIsTheLargestPrimeOfZero (){assert LargestPrime.getLargestPrime(0) == -1;}
    @Test
    void fiveIsTheLargestPrimeOfFortyFive (){assert LargestPrime.getLargestPrime(45) == 5;}
    @Test
    void negativeOneIsTheLargestPrimeOfNegativeOne (){assert LargestPrime.getLargestPrime(-1) == -1;}


}
