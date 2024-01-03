package org.mfon.section6.ForLoop;

public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + " % interest = " + interestAmount);
        }

        for (double rateInDollar = 7.5; rateInDollar <= 10; rateInDollar += 0.25){
            double interestAmountInDollar = calculateInterest(100.0, rateInDollar);
            System.out.println("100$ at " + rateInDollar + " % interest = " + interestAmountInDollar);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
