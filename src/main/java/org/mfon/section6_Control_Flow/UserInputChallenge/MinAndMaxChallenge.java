package org.mfon.section6_Control_Flow.UserInputChallenge;
import java.util.Scanner;
/**
 Min and Max Challenge
 You'll be using an endless loop which:
 • Prompts the user to enter a number, or any character to quit.
 • Validates if the user-entered data really is a number, you can choose either an integer,
 or double validation method.
 • If the user-entered data is not a number, quit the loop.
 • Keep track of the minimum number entered.
 • Keep track of the maximum number entered.
 If the user has previously entered a set of numbers (or even just one), display the
 minimum, and maximum number, which the user entered.
 */
public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopCount = 0;
        double minNumber = 0;
        double maxNumber = 0;
        while (true) {
            System.out.println("Enter a number or any character to exit:");
            String  nextEntry = scanner.nextLine();
            //To check the input of invalid numbers and characters, we use the try and catch statement.
            try {
                double validNumber = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNumber < minNumber){
                    minNumber = validNumber;
                }
                if (loopCount == 0 || validNumber > maxNumber){
                    maxNumber = validNumber;
                }
                loopCount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        if (loopCount > 0){
            System.out.println("min = " + minNumber + ", max = " + maxNumber);
        }else {
            System.out.println("No valid data entered");

        }
    }
}
