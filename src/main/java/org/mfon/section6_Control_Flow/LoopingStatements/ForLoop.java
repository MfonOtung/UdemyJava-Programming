package org.mfon.section6_Control_Flow.LoopingStatements;

public class ForLoop {
    public static void main(String[] args) {
//        for (int counter = 1; counter <= 5; counter++){
//            System.out.println(counter);
//        }
//
//        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        for (double rate = 2.0; rate <= 5.0; rate++){
//            double interestAmount = calculateInterest(10000.0, rate);
//            System.out.println("10,000 at " + rate + " % interest = " + interestAmount);
//        }
//
//        for (double rateInDollar = 7.5; rateInDollar <= 10; rateInDollar += 0.25){
//            double interestAmountInDollar = calculateInterest(100.0, rateInDollar);
//            if (interestAmountInDollar > 8.5){
//                break;}
//            System.out.println("100$ at " + rateInDollar + " % interest = " + interestAmountInDollar);
//        }
//
//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + " a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + " a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + " a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + " a prime number");
//        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + " a prime number");
//        System.out.println("5 is " + (isPrime(5) ? "" : "NOT ") + " a prime number");
//        System.out.println("6 is " + (isPrime(6) ? "" : "NOT ") + " a prime number");
//        System.out.println("7 is " + (isPrime(7) ? "" : "NOT ") + " a prime number");
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + " a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + " a prime number");

        int count = 0;
        for (int i = 10; count < 3 && i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
                /**if (count == 3){
                 System.out.println("Found 3 - Exiting for loop");
                 break;
                 }*/
            }
        }
        //System.out.println("Total number of prime numbers between 10 and 50 is " + count);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    /**
     Create a prime number counter variable, that will keep count of how many prime numbers
     were found.
     Create a for statement , using any range of numbers, where the maximum number is <= 1000.

     For each number in the range:
     Check to see if it's a prime number using the isPrime number counter variable.
     Once the prime number counter equals three, exit the loop ( Hint - use the break statement to exit)
     * @param wholeNumber
     * @return
     */
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
