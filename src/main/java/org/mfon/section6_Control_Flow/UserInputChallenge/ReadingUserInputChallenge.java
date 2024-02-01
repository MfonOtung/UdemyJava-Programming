package org.mfon.section6_Control_Flow.UserInputChallenge;

import java.util.Scanner;

/**
 Reading User Input Challenge
 In this challenge, you'll read 5 valid numbers from the console, entered by the user, and
 print the sum of those five numbers.
 You'll want to check that the numbers entered, are valid integers.
 If not, print out the message "Invalid number" to the console, but continue looping, until
 you do have 5 valid numbers.
 Before the user enters each number, prompt them with the message, "Enter number #x:",
 where x represents the count, 1, 2, 3, etc.
 And as an example there, the first message would look something like,
 "Enter number #1:", the next, "Enter number #2:", and so on.
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        //double sum = 0; can be used if we want to allow the input of decimal numbers
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String  nextNumber = scanner.nextLine();
            //To check the input of invalid numbers and characters, we use the try and catch statement.
            try {
                int number = Integer.parseInt(nextNumber);
                //double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        }

        //Using a do-while loop:
        /**
         do {
            System.out.println("Enter number #" + counter + ":");
            String  nextNumber = scanner.nextLine();
            //To check the input of invalid numbers and characters, we use the try and catch statement.
            try {
                int number = Integer.parseInt(nextNumber);
                //double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        }while (counter <= 5)
         */
        System.out.println("The sum of the 5 numbers = " + sum);
    }
}