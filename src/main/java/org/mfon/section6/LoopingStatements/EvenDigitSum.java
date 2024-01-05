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
        System.out.println(getEvenDigitSum(252));
    }

<<<<<<< HEAD
    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

=======
   public static int getEvenDigitSum(int number) {
        
        if (number < 0) {
            return -1;
        }
 
>>>>>>> 32ae88279ffc930f66153cdd828461b2832483f3
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
<<<<<<< HEAD

=======
 
>>>>>>> 32ae88279ffc930f66153cdd828461b2832483f3
        // == alternative using while loop ==
        // while (number > 0) {
        //     int lastDigit = number % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        //     number /= 10;
        // }
<<<<<<< HEAD

=======
       
>>>>>>> 32ae88279ffc930f66153cdd828461b2832483f3
        return sum;
    }
}
