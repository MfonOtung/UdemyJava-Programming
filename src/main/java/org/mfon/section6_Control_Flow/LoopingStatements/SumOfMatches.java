package org.mfon.section6_Control_Flow.LoopingStatements;

/**Sum of 3 and 5 Challenge:
 Create a for loop using a range of numbers from 1 to 1000 inclusive.
 Sum all the numbers that can be divided by both 3 and 5.
 Print out the numbers that have met the above conditions.
 Break out the loop once you have found 5 numbers that met the conditions above.
 Note: type all code in the main method.
 */

public class SumOfMatches {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for ( int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)){
                count++;
                sum += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if (count == 5){
                    break;
            }
        }
        System.out.println("Sum = " + sum);

        for (int number = 100; number < 200; number += 10){
            System.out.println("number = " + number);
        }
    }
}
