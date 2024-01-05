package org.mfon.section6.LoopingStatements;

/**
 Even Digit Sum:
 Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.

 EXAMPLE INPUT/OUTPUT:

 getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 getEvenDigitSum(-22); → should return -1 since the number is negative

 NOTE: The method getEvenDigitSum ​should be defined as public static like we have been doing so far in the course.
 NOTE: Do not add a main method to the solution code.
 */

public class EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(252);
    }

    public static int getEvenDigitSum(int number) {

        // declare variables
        int lastDigit = 0;
        int evenDigitSum = 0;

        // loop to repeat the process
        while(number > 9) {

            // find last digit
            lastDigit = number%10;

            // check last digit even?
            if(lastDigit % 2 == 0)
                // add it to sum
                evenDigitSum += lastDigit;
        }

        // remove last digit of number
            number = number / 10;

        // return sum value
        return evenDigitSum;
    }





//        if (number < 0) {
//            return -1;
//        }
//        int  evenSum = 0;
//        while (number> 9){
////            if (evenSum % 2 == 1){
////                return 0;
////            }
//            evenSum += (number % 10);
//            number = (number / 10);
//            if ((number % 10) % 2 == 0 && number % 2 == 0){
//                evenSum += number;
//            }
//        }
//
//        return  evenSum;

}
